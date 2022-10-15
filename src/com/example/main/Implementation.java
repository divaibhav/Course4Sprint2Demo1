package com.example.main;

import com.example.exception.InvalidAgeException;
import com.example.util.Registration;

public class Implementation {
    public static void main(String[] args) {
        Registration registration = new Registration();
        try {
            boolean response = registration.userRegistration("Vasu", 4);
            if(response){
                System.out.println("Successfully Registered");
            }else{
                System.out.println("UnderAge, registration failed");
            }
        }catch (InvalidAgeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
