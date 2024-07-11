package com.example.demo.login;

import com.example.demo.appuser.AppUser;
import com.example.demo.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {
    private final AppUserService appUserService;

    //changed
    public String login(LoginRequest request) {

        return appUserService.loginUser(request.getEmail(), request.getPassword());
    }
}
