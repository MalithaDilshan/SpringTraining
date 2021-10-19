package org.example;

import org.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.stubs.Samsung;

/**
 * Source and reference
 * https://www.youtube.com/watch?v=If1Lw4pLLEo
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung myPhone = applicationContext.getBean(Samsung.class);
        myPhone.config();
    }
}
