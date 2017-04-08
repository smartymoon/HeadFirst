/**
 * Created by lee on 2017/4/8.
 */
public class StartCoffee {
    public static void main(String[] args)
    {
        Beverage espresso = new Espresso();
        System.out.println("来一杯 Espresso.");
        Beverage soy       = new Soy(espresso);
        System.out.println("加Soy");
        Beverage mocha = new Mocha(soy);
        System.out.println("加mocha");
        Beverage whip = new Whip(mocha);
        System.out.println("加Whip");

        System.out.println("最后我要了：" + whip.getDescription());
        System.out.println("我一共花了:" + whip.cost());

    }
}
