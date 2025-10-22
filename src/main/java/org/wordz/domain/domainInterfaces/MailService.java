package org.wordz.domain.domainInterfaces;

public interface MailService {

    void sendEmail(String recipient, String subject,
                   String text);
}
