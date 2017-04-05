/**
 * Created by lee on 2017/4/5.
 */
public class FutureBoard implements Observer, displayAble {
     private float temp;
     private float humidity;
     private float wind;

    private Subject subject;
    public FutureBoard(Subject subject)
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
        System.out.println("我是未来面板，我刚刚拿到了数据,温度:" + temp + ";湿度:" + humidity + ";风力:" + wind);
    }
}
