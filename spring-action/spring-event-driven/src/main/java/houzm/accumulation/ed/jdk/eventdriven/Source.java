package houzm.accumulation.ed.jdk.eventdriven;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * Author: hzm_dream@163.com
 * Date:  2019/1/14 22:01
 * Modified By:
 * Description：事件源，包含存放监听器的容器
 */
public class Source {

    private int state;

    private List<EventListener> listeners = new ArrayList<>();


    public Source(int state) {
        this.state = state;
    }

    /**
     * 注册listener监听器
     * @param urListener
     */
    public void addListener(SourceEventListener urListener) {
        listeners.add(urListener);
    }

    /**
     * 删除listener监听器
     * @param urListener
     */
    public void removeListener(SourceEventListener urListener) {
        listeners.remove(urListener);
    }

    /**
     * 通知所有监听器
     */
    public void notifyListeners() {
        for (EventListener listener : listeners) {
            if (listener instanceof SourceEventListener) {
                ((SourceEventListener) listener).handlerEvent(new SourceEventObject(this));
            }
        }
    }

    /**
     * 改变状态
     * @param state
     */
    public void changeState(int state) {
        this.state = state;
        notifyListeners();
    }

    public int getState() {
        return state;
    }
}
