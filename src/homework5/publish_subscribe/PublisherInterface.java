package homework5.publish_subscribe;

/**
 * Created by ns on 2/6/2016.
 */

public interface PublisherInterface {
    public void register(SubscriberInterface o);
    public void unregister(SubscriberInterface o);
    public void notifySubscriber();
}
