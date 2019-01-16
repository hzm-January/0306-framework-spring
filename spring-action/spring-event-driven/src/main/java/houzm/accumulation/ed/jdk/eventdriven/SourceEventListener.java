package houzm.accumulation.ed.jdk.eventdriven;

import java.util.EventListener;

/**
 * Author: hzm_dream@163.com
 * Date:  2019/1/14 21:50
 * Modified By:
 * Description：监听器
 */
public class SourceEventListener implements EventListener {
    public void handlerEvent(SourceEventObject register) {
        System.out.println(" change state success, the object : " + register.getSource() + " | state is: " + register.state() + " now");
        System.out.println("update other info ....");
    }
}
