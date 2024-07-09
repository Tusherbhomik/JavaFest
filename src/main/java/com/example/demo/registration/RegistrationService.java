package com.example.demo.registration;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register(RegistrationRequest request) {
//        boolean isValidEmail = emailValidator.
//                test(request.getEmail());

//        if (!isValidEmail) {
//            throw new IllegalStateException("email not valid");
//        }

//        String token = appUserService.signUpUser(
//                new AppUser(
//                        request.getFirstName(),
//                        request.getLastName(),
//                        request.getEmail(),
//                        request.getPassword(),
//                        AppUserRole.USER
//
//                )
//        );
        return "it works";
    }
}
