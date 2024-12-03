package com.sendemail.sendemail.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sendemail.sendemail.Dtos.EmailContentDto;
import com.sendemail.sendemail.Dtos.EmailSent;
import com.sendemail.sendemail.Services.SendEmailService;

import jakarta.mail.MessagingException;

@RestController
@RequestMapping
public class sendEmailController {

    @Autowired
    private SendEmailService sendEmailService;
    private EmailSent emailSent;

    @PostMapping("/sendEmail")
    public /* ResponseBody<EmailSent> */ void sendEmail(@RequestBody EmailContentDto request) {
        /* emailSent = */ try {
            sendEmailService.sendEmail(request.getTo(), request.getSubject(), request.getMessage());
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // return ResponseEntity.ok().body(emailSent);
    }

}
