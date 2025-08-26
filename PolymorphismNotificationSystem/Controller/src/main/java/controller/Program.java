package controller;

import notificationsystem.EmailNotification;
import notificationsystem.Notification;
import notificationsystem.PushNotification;
import notificationsystem.SMSNotification;

/**
 * The Program class is the entry point for demonstrating the
 * Polymorphism-based Notification System.
 */
public class Program {

    /**
     * The main method runs the notification system demo.
     *
     * @param args the command line arguments (not used).
     */
    public static void main(final String[] args) {

        /**
         * Creating various notification objects.
         */
        final Notification emailNotification = new EmailNotification();
        final Notification smsNotification = new SMSNotification();
        final Notification pushNotification = new PushNotification();

        /**
         * Sending various notifications.
         */
        System.out.println("Sending various notification");
        emailNotification.send("Mail #1");
        smsNotification.send("Msg #1");
        pushNotification.send("Push #1");
        emailNotification.send("Mail #2");
        System.out.println("Notifications were successfully sent");

        /**
        * Getting the count of different types of notification sent.
        */
        System.out.println("\n--- Notification Counts ---");
        System.out.println("Emails sent: " + emailNotification.getCount());
        System.out.println("SMS sent: " + smsNotification.getCount());
        System.out.println("Push sent: " + pushNotification.getCount());
    }
}


