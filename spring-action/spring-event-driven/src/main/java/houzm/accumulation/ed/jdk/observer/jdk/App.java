package houzm.accumulation.ed.jdk.observer.jdk;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 13:36
 * description:
 */
public class App {
    public static void main(String[] args) {
        HouseInfo houseInfo = new HouseInfo(12000.00f);
        HousePriceObserver observerJack = new HousePriceObserver("Jack");
        HousePriceObserver observerMarry = new HousePriceObserver("Marry");
        HousePriceObserver observerSteven = new HousePriceObserver("Steven");
        houseInfo.addObserver(observerJack);
        houseInfo.addObserver(observerMarry);
        houseInfo.addObserver(observerSteven);
        houseInfo.setPrice(11111.11f);
        System.out.println("------------------------------");
        houseInfo.setPrice(11221.11f);
        System.out.println("------------------------------");
        houseInfo.setPrice(31221.11f);
    }
}
