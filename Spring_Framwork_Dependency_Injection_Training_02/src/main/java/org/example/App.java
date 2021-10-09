package org.example;

import org.example.animal.Animal;
import org.example.animal.Lion;
import org.example.habitat.Cage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * When specify an animal object as 'Lion', we have to change the code if we need to change the animal as
         * 'Deer'. To overcome this problem we can use dependency injection methods using the Spring framework
         */
//        Animal animal = new Lion();
//        animal.eat();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        /*
        Animal animal = (Animal) applicationContext.getBean("animal");
        animal.eat();
        System.out.println(animal.getMessage());
        */

        /**
         * Directly invoking the 'lion' using the annotation based configurations. We do not need
         * to specify the bean definition in the 'bean.xml' file
         */

        Animal animal = (Animal) applicationContext.getBean("lion");
        animal.eat();
        animal.getMessage();

        /**
         * Constructor injection using the xml
         */
        Cage cage = (Cage) applicationContext.getBean("cage");
        System.out.println( cage );


    }
}
