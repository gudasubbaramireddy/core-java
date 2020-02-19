package java8features.methodreference;

import java.util.function.BiFunction;

interface Sayable{
    void say();
}

public class MethodReference {

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodReference::saySomething;
        // Calling interface method
        sayable.say();

        //using thread
        Thread thread=new Thread(MethodReference::ThreadStatus);
        thread.start();

        //BiFunction
        BiFunction<Integer,Integer,Integer> adder=MethodReference::add;
        System.out.println(adder.apply(10,25));

        //if you want to call non static methods in main() method you should create object .then take object reference & can call.
        Sayable sayable1=new MethodReference()::saySomethings;
        sayable1.say();


    }


    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void ThreadStatus(){
        System.out.println("Hello, thread is running");
    }

    public static int add(int x,int y){
        return x+y;
    }
    public void saySomethings(){
        System.out.println("this is non static method...");
    }
}

