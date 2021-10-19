package org.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.stubs.Processor;
import org.stubs.Samsung;
import org.stubs.SnapDragon;

@Configuration
@ComponentScan( basePackages = "org.stubs")  // Scan all the components
public class AppConfig {

    /*
    @Bean
    public Samsung getPhone()
    {
        return new Samsung();
    }

    @Bean
    public Processor getProcessor()
    {
        return new SnapDragon();
    }*/

    /**
     * We can comment out getBean section by using the @Component annotation in the related bean classes
     * and @ComponentScan annotation with base package
     */

}
