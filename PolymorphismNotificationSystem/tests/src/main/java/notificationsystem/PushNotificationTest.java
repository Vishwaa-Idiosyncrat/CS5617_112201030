package notificationsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link PushNotification}.
 */
public class PushNotificationTest {

    /**
     * Test that sending a push notification increases the notification count.
     */
    @Test
    void testSendIncreasesCount() {
        final PushNotification push = new PushNotification();
        final int before = push.getCount();

        push.send("Push 1");
        push.send("Push 2");
        push.send("Push 3");
        final int i = 3;

        assertEquals(before + i, push.getCount());
    }
}
