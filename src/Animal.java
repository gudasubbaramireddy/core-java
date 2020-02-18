import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Animal {
    public void walk() {
        System.out.println("Walking Animal");
    }
}

class Dog extends Animal {
    public void walk() {
        System.out.println("Walking Dog");
    }

    public void sleep() {
        System.out.println("Sleeping Dog");
    }
}

class Cat extends Animal {
    public void walk() {
        System.out.println("Walking Cat");
    }

    public void sleep() {
        System.out.println("Sleeping Cat");
    }
}

class Demo {
    public static void main(String[] args) {
        Animal a = new Animal();
        //List<Animal> a1=new ArrayList<>();
        //a1.add(a);
        Dog d = new Dog();
        List<Dog> d1 = new ArrayList<>();
        d1.add(d);
        List<Cat> c1 = new ArrayList<>();


        List<Object> a1 = new ArrayList<>();
        if (d1 != null)
            a1.addAll(d1);
        else if (c1 != null) {
            a1.addAll(c1);
        }
        sample(a1);

       /* d1.add(d);
        a.walk();
        a1.get(0).walk();
        d.walk();
        d1.get(0).walk();
        d.sleep();
        d1.get(0).sleep();

        //upcasting
        Animal a2 = (Animal)d;
        List<Animal> a21=new ArrayList<>();
        a21.add(d1);
        a2.walk();
        a21.get(0).walk();*/
        //a2.sleep();  error

        //downcasting
        /*nimal a3 = new Dog();
        //Dog d2 = a3;  //compile time error
        Dog d2 = (Dog)a3;
        d2.walk();
        d2.sleep();

        //Run time error: Animal cannot be cast to Dog
        Animal a4 = new Animal();*/
        //Dog d3 = (Dog)a4;
        //d3.walk();
        //d3.sleep();

    }

    public static void sample(List<Object> aamp) {
       /* if (aamp instanceof List<Dog>)
            System.out.println("ok success");
        else
            System.out.println("no dog");*/
       
    }
}
