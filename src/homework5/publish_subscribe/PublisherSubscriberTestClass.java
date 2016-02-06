package homework5.publish_subscribe;

/**
 * Created by ns on 2/6/2016.
 */
public class PublisherSubscriberTestClass {

    public static void main(String[] args){

        // Create the Publisher object
        PublisherClass publisherObject = new PublisherClass();

        // Create an Subscriber that will be sent updates from Publisher
        SubscriberClass subscriber1 = new SubscriberClass(publisherObject);

        publisherObject.setVal1(111.00);

        publisherObject.setVal2(222.22);

        SubscriberClass subscriber2 = new SubscriberClass(publisherObject);

        publisherObject.setVal1(333.00);

        publisherObject.setVal2(444.44);


//        // Delete one of the subscribers
//
//        // publisherObject.unregister(subscriber2);
//
//        publisherObject.setIBMPrice(197.00);
//        publisherObject.setAAPLPrice(677.60);
//        publisherObject.setGOOGPrice(676.40);
//
//        // Create 3 threads using the Runnable interface
//        // GetTheStock implements Runnable, so it doesn't waste
//        // its one extendable class option
//
//        Runnable getIBM = new GetTheStock(publisherObject, 2, "IBM", 197.00);
//        Runnable getAAPL = new GetTheStock(publisherObject, 2, "AAPL", 677.60);
//        Runnable getGOOG = new GetTheStock(publisherObject, 2, "GOOG", 676.40);
//
//        // Call for the code in run to execute
//
//        new Thread(getIBM).start();
//        new Thread(getAAPL).start();
//        new Thread(getGOOG).start();


    }
}
