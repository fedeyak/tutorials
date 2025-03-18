package main;

import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Person person = context.getBean(Person.class);

//        Parrot parrot = context.getBean(Parrot.class);


        System.out.println(person.getName());
        System.out.println(person.getParrot());
    }

}
