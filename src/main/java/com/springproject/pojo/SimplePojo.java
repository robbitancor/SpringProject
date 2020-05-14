package com.springproject.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SimplePojo {
    private String message;

    @Autowired
    private Person person;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void displayPersonName(){
        System.out.println(person.getName());
    }

    public void displayPersonGender(){
        System.out.println(person.getGender());
    }
}
