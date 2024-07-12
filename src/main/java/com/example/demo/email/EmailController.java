package com.example.demo.email;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class EmailController {

    @Autowired
    private EmailService emailService;


    @PostMapping(path = "/send/{email}")
    public String sendEmail(@PathVariable String email, @RequestBody EmailStructure emailStructure) {
        emailService.sendEmail(email, emailStructure);
        return "Email sent successfully to " + email + "!";
    }
}
