package org.stubs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // Non qualified and de-capitalized, by default this will be getting the samsung
public class Samsung {

    @Autowired
    @Qualifier("orgCare")  // If there is several processor implementation, we can use this without @Primary annotation
    private Processor processor;

    public void config()
    {
        System.out.println("Octa Core, 8GB Ram, 128GB storage");
        processor.process();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "processor=" + processor +
                '}';
    }
}
