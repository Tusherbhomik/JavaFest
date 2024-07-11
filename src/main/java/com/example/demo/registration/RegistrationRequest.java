package com.example.demo.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class RegistrationRequest {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;
}
