package notificationsystem;

/**
 * The Notification class is the common interface which will be used by various types of notification.
 */
public abstract class Notification {
    /**
     * The "send" function sends a Push Notification with teh given message.
     *
     * @param msg the message to be sent.
     */
    public abstract void send(String msg);

    /**
     * The "getCount" function returns the number of notification that has been sent.
     *
     * @return count is the number of notifications that will be sent.
     */
    public abstract int getCount();
}
