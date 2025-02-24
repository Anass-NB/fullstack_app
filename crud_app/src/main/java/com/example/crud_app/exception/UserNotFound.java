package com.example.crud_app.exception;

public class UserNotFound extends RuntimeException {
    public UserNotFound(Long id) {
        super("Could not found the user with id "+ id);
    }
}
