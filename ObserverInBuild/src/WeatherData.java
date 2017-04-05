import java.util.Observable;

/**
 * Created by lee on 2017/4/5.
 */
public class WeatherData extends Observable{
    public float temp;
    public float wind;
    public float humidity;

    public void dataChange(float temp, float wind, float humidity)
    {
       this.temp = temp;
       this.wind = wind;
       this.humidity = humidity;
       setChanged();
       notifyObservers();
    }

    public float getTemp()
    {
        return temp;
    }

    public float getWind()
    {
        return wind;
    }

    public float getHumidity()
    {
        return humidity;
    }
}
