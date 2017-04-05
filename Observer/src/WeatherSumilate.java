/**
 * Created by lee on 2017/4/5.
 */
public class WeatherSumilate {
    public static void main(String [] args)
    {
        WeatherData weatherData = new WeatherData();
        //注入观察者
        CountBoard countBoard = new CountBoard(weatherData);
        FutureBoard futureBoard = new FutureBoard(weatherData);
        CurrentBoard currentBoard = new CurrentBoard(weatherData);

        weatherData.dataChanged(10.3f, 234.3f ,123.3f);
        System.out.println("当前面板不玩了");
        weatherData.removeObserver(currentBoard);
        weatherData.dataChanged(1999.3f, 234.3f ,123.3f);
    }
}
