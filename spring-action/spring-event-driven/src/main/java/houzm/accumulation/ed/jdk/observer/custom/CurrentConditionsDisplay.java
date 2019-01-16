package houzm.accumulation.ed.jdk.observer.custom;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 13:01
 * description:
 */
public class CurrentConditionsDisplay implements Observer {
    private float temperature; //温度
    private float humidity; //湿度
    private float pressure; //气压
    private Subject subject; //主题

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("当前布告板: 温度" + temperature + "度,湿度" + humidity + "%");
    }
}
