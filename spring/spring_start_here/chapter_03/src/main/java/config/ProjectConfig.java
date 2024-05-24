package config;

import beans.Parrot;
import beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean
    public Person person(@Qualifier ("parrot2") Parrot parrot) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot);
        return person;
    }

//    @Bean
//    public Person person(Parrot parrot2) {
//        Person person = new Person();
//        person.setName("Ella");
//        person.setParrot(parrot2);
//        return person;
//    }


//    @Bean
//    public Parrot parrot () {
//        Parrot parrot = new Parrot();
//        parrot.setName("Koko");
//        return parrot;
//    }

//    @Bean
//    public Person person(Parrot parrot) {
//        Person person = new Person();
//        person.setName("Ella");
//        person.setParrot(parrot);
//        return person;
//    }

//    @Bean
//    public Person person() {
//        Person person = new Person();
//        person.setName("Ella");
//        person.setParrot(parrot());
//        return person;
//    }
}
