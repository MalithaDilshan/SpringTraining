package org.example.animal;

import org.springframework.stereotype.Component;

@Component
public class Deer implements Animal{

    private String message;

    public Deer()
    {
        init();
    }

    private void init()
    {
        this.message = "";
    }

    @Override
    public void eat() {
        System.out.println("I am eating grass");
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
        return "Deer{" +
                "message='" + message + '\'' +
                '}';
    }
}
