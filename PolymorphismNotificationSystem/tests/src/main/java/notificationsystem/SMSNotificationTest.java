package notificationsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link SMSNotification}.
 */
public class SMSNotificationTest {

    /**
     * Test that sending an SMS increases the notification count.
     */
    @Test
    void testSendIncreasesCount() {
        final SMSNotification sms = new SMSNotification();
        final int before = sms.getCount();
        sms.send("Hello SMS");
        final int i = 1;

        assertEquals(before + i, sms.getCount());
    }
}
