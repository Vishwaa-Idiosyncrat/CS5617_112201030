package notificationsystem;

/**
 * The EmailNotification represents the notification sent via Email.
 * It extends {@link Notifiication} and tracks how many Email messages have been sent.
 */
public class EmailNotification extends Notification {
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
     * The "send" function sends an Email Notification with teh given message.
     *
     * @param msg the message to be sent.
     */
    @Override
    public void send(final String msg) {
        System.out.println("Email: " + msg);
        count++;
    }

    /**
     * The "getCount" function returns the number of notification that has been sent.
     *
     * @return count is the number of email notifications.
     */
    @Override
    public int getCount() {
        return count;
    }
}
