package houzm.accumulation.ed.spring.xml;

import java.util.concurrent.TimeUnit;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 14:30
 * description: 监听器
 * 如果支付状态发生改变，对商品进行出货
 */
@Service
public class TicketingListener implements ApplicationListener<PaymentStatusEvent> {

    @Override
    public void onApplicationEvent(PaymentStatusEvent event) {
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
