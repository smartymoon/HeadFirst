import java.util.Observable;
import java.util.Observer;

/**
 * Created by lee on 2017/4/5.
 */
public class CountBoard implements Observer, DisplayAble {
    private Observable observer;
    private float humidity;
    private float temp;
    private float wind;
    public CountBoard(Observable observer)
    {
       this.observer = observer;
       observer.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("i am CountBoard , and temp is:" + temp + ";wind is:" + wind + ";humidity is:" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        temp = weatherData.getTemp();
        humidity = weatherData.getHumidity();
        wind = weatherData.getWind();
        display();
    }
}
