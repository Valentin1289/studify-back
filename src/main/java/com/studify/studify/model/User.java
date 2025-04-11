package com.studify.studify.model;

import lombok.Builder;

@Builder
public class User {
    Long id;
    String firstName;
    String lastName;
    String email;
    String password;
    String profilePicture;
    Long age;
}
