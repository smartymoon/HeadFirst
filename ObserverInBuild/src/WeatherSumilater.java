import java.util.Observer;

/**
 * Created by lee on 2017/4/5.
 */
public class WeatherSumilater {
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        Observer currentBoard = new CurrentBoard(weatherData);
        Observer futureBoard  = new FutureBoard(weatherData);
        Observer countBoard   = new CountBoard(weatherData);

        weatherData.dataChange(10,23,2);
        weatherData.notifyObservers();
        weatherData.deleteObserver(currentBoard);
        weatherData.deleteObserver(futureBoard);
        weatherData.dataChange(23,4,123);
        weatherData.notifyObservers();
    }
}
