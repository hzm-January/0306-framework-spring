package houzm.accumulation.ed.spring.service;

import houzm.accumulation.ed.spring.PaymentInfo;
import houzm.accumulation.ed.spring.PaymentStatusEvent;

import java.util.UUID;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 14:40
 * description:
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService, ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void paymentSuccess(String message, String id) {
        if (message != null
                && message.trim().length() > 0
                && "success".equalsIgnoreCase(message)) {
            applicationEventPublisher.publishEvent(
                    new PaymentStatusEvent(
                            new PaymentInfo(id,
                                    2, UUID.randomUUID().toString())));
        }
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
