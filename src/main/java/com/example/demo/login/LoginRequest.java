package com.example.demo.login;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class LoginRequest {
    private String email;
    private String password;
}
