package Mail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MailTest {

    @Test
    public void sendWelcomeMail(){
        var mailService = new MockMailService();
        var notification = new UserNotification(mailService);
        notification.welcomNewUser();
        Assertions.assertTrue(mailService.wasCalled);
        Assertions.assertEquals ("newuser@example.com", mailService.actualRecipient);
        Assertions.assertEquals ("Welcome!", mailService.actualSubject);

    }
}
