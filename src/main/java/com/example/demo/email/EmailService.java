package com.example.demo.email;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

    @Autowired
    private  JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromMail;

    public void sendEmail(String email,EmailStructure emailStructure){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromMail);
        message.setSubject(emailStructure.getSubject());
        message.setText(emailStructure.getMessage());
        message.setTo(email);

        mailSender.send(message);
    }
}