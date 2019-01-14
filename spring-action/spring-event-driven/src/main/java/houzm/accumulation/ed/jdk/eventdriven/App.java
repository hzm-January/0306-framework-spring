package houzm.accumulation.ed.jdk.eventdriven;

/**
 * Author: hzm_dream@163.com
 * Date:  2019/1/14 22:13
 * Modified By:
 * Description：java 事件驱动
 */
public class App {
    public static void main(String[] args) {
        Source source = new Source(1);
        source.addListener(new SourceEventListener());
        source.changeState(2);
        source.changeState(3);
        source.changeState(4);
    }
}
