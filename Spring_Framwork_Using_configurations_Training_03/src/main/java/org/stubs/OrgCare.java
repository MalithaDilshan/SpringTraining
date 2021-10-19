package org.stubs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary   // This is because now two processor implementation, then we have to specify the primary one to avoid confusion
public class OrgCare implements Processor{

    @Override
    public void process() {
        System.out.println("CPU model : OrgCare G4");
    }
}
