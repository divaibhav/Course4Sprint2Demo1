package com.example.util;

import com.example.exception.InvalidAgeException;

public class Registration {
    public boolean userRegistration(String name, int age) throws InvalidAgeException{
        boolean response = true;
        if(age < 13){
            // generated exception
            InvalidAgeException invalidAgeException = new InvalidAgeException("user is underage");

            throw invalidAgeException;



        }

        return response;
    }
}
