package houzm.accumulation.ed.jdk.observer.custom;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 12:40
 * description: 主题
 */
public interface Subject {

    // 注册 观察者
    void registerObserver(Observer observer);
    // 移除 观察者
    void removeObserver(Observer observer);
    // 通知 观察者
    void notifyObservers();

}
