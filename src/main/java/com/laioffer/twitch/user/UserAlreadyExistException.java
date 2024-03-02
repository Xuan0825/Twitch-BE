package com.laioffer.twitch.user;


public class UserAlreadyExistException extends RuntimeException{


    UserAlreadyExistException(String message) {
        super(message);
    }
}
