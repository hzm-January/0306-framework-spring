package houzm.accumulation.ed.spring.annotation;

import java.util.concurrent.TimeUnit;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 14:30
 * description: 监听器
 * 如果支付状态发生改变，对商品进行出货
 */
@Service
public class TicketingListener {

    @Async
    @EventListener
    public void ticketing(PaymentStatusEvent event) {
        Object source = event.getSource();
        if (source instanceof PaymentInfo) {
            int status = ((PaymentInfo) source).getStatus();
            String id = ((PaymentInfo) source).getId();
            if (status == 2) {
                //已支付
                try {
                    //模拟出票操作
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("-------------  do ticket end " + id + " ------------");
            }
        }
    }
}
