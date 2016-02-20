package homework5.publish_subscribe;

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


        // Delete subscribers

        publisherObject.unregister(subscriber1);
        publisherObject.unregister(subscriber2);



    }
}
