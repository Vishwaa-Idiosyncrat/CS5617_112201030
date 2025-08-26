package notificationsystem;

/**
 * The SMSNotification represents the notification sent via SMS.
 * It extends {@link Notifiication} and tracks how many SMS messages have been sent.
 */
public class SMSNotification extends Notification {
    /**
     * The private variable count is used to track the number of SMS notification sent.
     */
    private static int count = 0;

    /**
     * The "resetCount" function resets the number of email notifications to zero.
     */
    public static void resetCount() {
        count = 0;
    }

    /**
     * The "send" function sends an SMS Notification with teh given message.
     *
     * @param msg the message to be sent.
     */
    @Override
    public void send(final String msg) {
        System.out.println("SMS: " + msg);
        count++;
    }

    /**
     * The "getCount" function returns the number of notification that has been sent.
     *
     * @return count is the number of SMS notifications.
     */
    @Override
    public int getCount() {
        return count;
    }
}
