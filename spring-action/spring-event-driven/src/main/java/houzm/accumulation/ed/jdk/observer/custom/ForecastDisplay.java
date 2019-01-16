package houzm.accumulation.ed.jdk.observer.custom;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 13:07
 * description:
 */
public class ForecastDisplay implements Observer {
    private float currentPressure = 0.0f; // 当前气压
    private float lastPressure;             // 上一次的气压
    private Subject subject;            // 主题

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    private void display() {
        if (currentPressure > lastPressure) {
            System.out.println("天气预报：温度正在持续上升！");
        } else {
            System.out.println("天气预报：注意气温下降了，可能有雨！");
        }
    }
}
