package org.stubs;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements Processor{

    @Override
    public void process() {
        System.out.println("CPU model : SnapDragon G8");
    }
}
