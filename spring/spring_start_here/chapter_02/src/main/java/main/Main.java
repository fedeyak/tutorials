package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");
        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        System.out.println(x);
        System.out.println(p);
        Parrot z = context.getBean(Parrot.class);
        System.out.println(p.getName());
        System.out.println(z.getName());

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        Parrot parrot = new Parrot();
//        parrot.setName("kiki");
//        Supplier<Parrot> parrotSupplier = () -> parrot;
//
//        context.registerBean("parrot1", Parrot.class, parrotSupplier);
//
//        Parrot parr = context.getBean(Parrot.class);
//        System.out.println(parr.getName());

//        Parrot parrot = context.getBean("parrot",  Parrot.class);

//        Parrot parrot = context.getBean(Parrot.class);

//        String string = context.getBean(String.class);


//        Parrot parrot1 = context.getBean("Mimi", Parrot.class);

//        System.out.println(parrot);
//        System.out.println(parrot.getName());

//        System.out.println(parrot);
//        System.out.println(parrot.getName());

//        System.out.println(string);
//        System.out.println(parrot1.getName());
    }


}
