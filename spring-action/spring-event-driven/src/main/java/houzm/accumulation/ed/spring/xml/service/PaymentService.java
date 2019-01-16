package houzm.accumulation.ed.spring.xml.service;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 14:40
 * description:
 */
public interface PaymentService {

    /**
     * 通常都是支付平台回调该方法
     */
    public void paymentSuccess(String message, String id);
}
