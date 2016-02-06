package homework5.publish_subscribe;

/**
 * Created by ns on 2/6/2016.
 */
public class SubscriberClass implements  SubscriberInterface {

    private PublisherClass publisher;

    private static int subscriberIDs = 0;
    private int subscriberID;

    private double val1;
    private double val2;

    public SubscriberClass( PublisherClass publisher) {
        this.subscriberID =  ++subscriberIDs;
        System.out.println("New subscriber " + this.subscriberID);
        this.publisher = publisher;
        this.publisher.register(this);
    }

    @Override
    public void update(double val1, double val2) {
        this.val1 =val1;
        this.val2 =val2;
        printTheValues();
    }

    public void printTheValues(){
        System.out.println("Subscriber with ID  " + subscriberID + "\n Val1: " + val1 + "\n Val2: " + val2 + "\n");

    }
}
