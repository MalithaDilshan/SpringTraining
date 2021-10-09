package org.example.animal;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

    private String message;

    public Lion()
    {
        init();
    }

    // Use for the constructor injection
    public Lion(String message) {
        this.message = message;
    }

    private void init()
    {
        this.message = "";
    }

    @Override
    public void eat() {
        System.out.println("I am eating meat");
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "message='" + message + '\'' +
                '}';
    }
}
