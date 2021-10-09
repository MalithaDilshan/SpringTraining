package org.example.habitat;

public class Cage {

    private String message;

    public Cage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Cage{" +
                "message='" + message + '\'' +
                '}';
    }
}
