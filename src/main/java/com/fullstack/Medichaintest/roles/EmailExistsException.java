package com.fullstack.Medichaintest.roles;

public class EmailExistsException extends Exception{
    public EmailExistsException(String message){
        super(message);
    }
}
