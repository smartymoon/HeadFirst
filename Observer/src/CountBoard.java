/**
 * Created by lee on 2017/4/5.
 */
public class CountBoard implements Observer, displayAble {
     private float temp;
     private float humidity;
     private float wind;

     private Subject subject;
     public CountBoard(Subject subject)
     {
        this.subject = subject;
        subject.registerObserver(this);
     }

    @Override
    public void update(float temp, float humidity, float wind) {
        this.temp = temp;
        this.humidity = humidity;
        this.wind = wind;
        display();
    }

    @Override
    public void display() {
        System.out.println("我是统计面板，我刚刚拿到了数据,温度:" + temp + ";湿度:" + humidity + ";风力:" + wind);
    }
}
