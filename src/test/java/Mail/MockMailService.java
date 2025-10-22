package Mail;

import org.wordz.domain.domainInterfaces.MailService;

public class MockMailService implements MailService {

    boolean wasCalled;
    String actualRecipient;
    String actualSubject;
    String actualText;


    @Override
    public void sendEmail(String recipient, String subject, String text) {

        wasCalled = true;
        actualRecipient = recipient;
        actualSubject = subject;
        actualText = text;

    }
}
