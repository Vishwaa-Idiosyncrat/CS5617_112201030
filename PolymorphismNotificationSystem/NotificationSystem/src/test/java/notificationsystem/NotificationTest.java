package notificationsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Polymorphism.
 */
class NotificationTest {

    @BeforeEach
    void resetAllCounts() {
        EmailNotification.resetCount();
        SMSNotification.resetCount();
        PushNotification.resetCount();
    }

    @Test
    void testDifferentNotificationsThroughBaseClass() {
        final Notification email = new EmailNotification();
        final Notification sms = new SMSNotification();
        final Notification push = new PushNotification();

        email.send("Mail msg");
        sms.send("SMS msg");
        push.send("Push msg");

        assertEquals(1, email.getCount());
        assertEquals(1, sms.getCount());
        assertEquals(1, push.getCount());
    }
}