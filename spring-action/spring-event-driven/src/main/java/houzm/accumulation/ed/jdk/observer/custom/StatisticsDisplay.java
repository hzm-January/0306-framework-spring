package houzm.accumulation.ed.jdk.observer.custom;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 13:04
 * description: 观察者 订阅天气信息
 * 显示最高气温、最低气温和平均气温
 */
public class StatisticsDisplay implements Observer {
    private float maxTemp = 0.0f;  // 最高温度
    private float minTemp = 0.0f;  // 最低温度
    private float tempSum = 0.0f;  // 温度更新和
    private int numReadings;       // 温度更新次数
    private Subject subject; //主题

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        float temp = temperature;
        tempSum += temp;
        numReadings++;

        // 设置最高温度
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        // 设置最低温度
        if (temp < minTemp) {
            minTemp = temp;
        }
        display();
    }

    private void display() {
        System.out.println("平均温度：" + (tempSum / numReadings) + ",最大温度："
                + maxTemp + ",最小温度：" + minTemp);
    }
}
