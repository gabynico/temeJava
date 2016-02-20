package homework5.publish_subscribe;

import java.util.ArrayList;

public class PublisherClass implements PublisherInterface {

    private ArrayList<SubscriberInterface> subscribers;

    private double val1;
    private double val2;

    public PublisherClass() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void register(SubscriberInterface o) {
        this.subscribers.add(o);
    }

    @Override
    public void unregister(SubscriberInterface o) {
        int k = this.subscribers.indexOf(o);
        this.subscribers.remove(k);
    }

    @Override
    public void notifySubscriber() {
        for (SubscriberInterface o: this.subscribers){
            o.update(val1, val2);
        }
    }

    public void setVal2(double val2) {
        this.val2 = val2;
        notifySubscriber();
    }

    public void setVal1(double val1) {
        this.val1 = val1;
        notifySubscriber();
    }
}
