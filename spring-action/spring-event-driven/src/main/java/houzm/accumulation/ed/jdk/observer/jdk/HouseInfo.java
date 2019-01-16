package houzm.accumulation.ed.jdk.observer.jdk;

import java.util.Observable;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 13:25
 * description:
 */
public class HouseInfo extends Observable {

    private float price; //房价

    public HouseInfo(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        setChanged();
        notifyObservers(price);
    }

    @Override
    public String toString() {
        return "当前房价：{" +
                "price=" + price +
                '}';
    }
}
