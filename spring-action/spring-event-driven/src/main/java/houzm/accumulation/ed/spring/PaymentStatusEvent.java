package houzm.accumulation.ed.spring;

import org.springframework.context.ApplicationEvent;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 14:27
 * description: 事件
 */
public class PaymentStatusEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public PaymentStatusEvent(PaymentInfo source) {
        super(source);
    }
}
