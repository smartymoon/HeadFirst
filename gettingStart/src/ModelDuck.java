import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by lee on 2017/4/4.
 */
public class ModelDuck extends Duck{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("i am Model duck");
    }
}
