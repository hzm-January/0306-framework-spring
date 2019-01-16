package houzm.accumulation.ed.jdk.eventdriven;

import java.util.EventObject;

/**
 * Author: hzm_dream@163.com
 * Date:  2019/1/14 21:49
 * Modified By:
 * Description：事件
 */
public class SourceEventObject extends EventObject {
    private int state;

    public SourceEventObject(Source source) {
        super(source);
        this.state = source.getState();
    }

    public int state() {
        return this.state;
    }
}
