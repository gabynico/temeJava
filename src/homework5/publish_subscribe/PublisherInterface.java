package homework5.publish_subscribe;

public interface PublisherInterface {
    void register(SubscriberInterface o);
    void unregister(SubscriberInterface o);
    void notifySubscriber();
}
