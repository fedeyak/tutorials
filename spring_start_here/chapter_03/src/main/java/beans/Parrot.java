package beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot
{
    private String name = "Koko";




    public String getName() {
        return name;
    }

//    public Parrot() {
//        System.out.println("I am aparrot");
//    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
