package notificationsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link EmailNotification}.
 */
public class EmailNotificationTest {

    /**
     * Test that sending an Email increases the notification count.
     */
    @Test
    void testSendIncreasesCount() {
        final EmailNotification email = new EmailNotification();
        final int before = email.getCount();

        email.send("Test Email 1");
        email.send("Test Email 2");
        final int i = 2;

        assertEquals(before + i, email.getCount());
    }
}
