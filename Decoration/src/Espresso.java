/**
 * Created by lee on 2017/4/8.
 */
public class Espresso extends Beverage{
    public  Espresso()
    {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.23;
    }
}
