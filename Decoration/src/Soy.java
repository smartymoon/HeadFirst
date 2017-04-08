/**
 * Created by lee on 2017/4/8.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;
    public Soy(Beverage beverage)
    {
       this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Soy ";
    }

    @Override
    public double cost() {
        return .33 + beverage.cost();
    }
}
