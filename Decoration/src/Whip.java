/**
 * Created by lee on 2017/4/8.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage)
    {
       this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip ";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
