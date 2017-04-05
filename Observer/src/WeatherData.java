import java.util.ArrayList;

/**
 * Created by lee on 2017/4/5.
 */
public class WeatherData implements Subject{
    private float temp;
    private float humidity;
    private float wind;

    private ArrayList observers;


    public WeatherData()
    {
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0;i < observers.size();i++)
        {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, wind);
        }
    }

    public void dataChanged(float temp, float humidity, float wind)
    {
        this.temp = temp;
        this.humidity = humidity;
        this.wind = wind;
        notifyObservers();
    }
}
