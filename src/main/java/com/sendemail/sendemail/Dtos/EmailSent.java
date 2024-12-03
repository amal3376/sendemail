package com.sendemail.sendemail.Dtos;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class EmailSent {
    String status;
    String to;
    String subject;
    String message;
    EmailSent emailSent;

    public EmailSent sent(String to, String subject, String message, String status) {
        emailSent = new EmailSent();
        emailSent.to = to;
        emailSent.message = message;
        emailSent.subject = subject;
        emailSent.status = status;
        return emailSent;
    }
}
