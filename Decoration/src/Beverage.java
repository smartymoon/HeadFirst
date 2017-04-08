/**
 * Created by lee on 2017/4/8.
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
