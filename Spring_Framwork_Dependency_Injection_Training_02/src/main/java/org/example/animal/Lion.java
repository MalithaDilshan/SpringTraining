package org.example.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

    private String message;

    @Autowired
    private Tail tail;

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

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
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

    public void printProperty()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(tail);
        System.out.println( sb );
    }
}
