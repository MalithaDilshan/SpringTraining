package org.example.animal;

import org.springframework.stereotype.Component;

@Component
public class Tail {

    private double normalLength = 10;  // default tail length

    public double getNormalLength() {
        return normalLength;
    }

    public void setNormalLength(double normalLength) {
        this.normalLength = normalLength;
    }

    @Override
    public String toString() {
        return "Tale{" +
                "normalLength=" + normalLength +
                '}';
    }
}
