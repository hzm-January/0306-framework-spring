package houzm.accumulation.ed.jdk.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 13:33
 * description:
 */
public class HousePriceObserver implements Observer {
    private String name;

    public HousePriceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof HouseInfo) {
            System.out.println("意愿购房者" + name + "观察到房价已调整为：" + arg);
        }
    }
}
