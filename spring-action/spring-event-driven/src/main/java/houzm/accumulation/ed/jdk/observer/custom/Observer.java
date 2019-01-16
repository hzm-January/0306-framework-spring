package houzm.accumulation.ed.jdk.observer.custom;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 12:41
 * description: 观察者
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
