package java8features.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
    //1.lambda with thread.
    //2.lambda :filter collection data

    public static void main(String args[]){
        FunInterface funInterface=x->System.out.println(2*x);
        funInterface.fun1(2);
        funInterface.fun2();
        /*
        1
        * */
        lambdaWithThread();
         /*
        2
        * */
         lambdaWithFilterCollectionData();

    }


    private static void lambdaWithThread() {
        //with out lamda
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("thread is running");
            }
        };
        new Thread(runnable).start();

        //Thread with lambda
        new Thread(()->System.out.println("Lambda thread is running")).start();

    }

    private static void lambdaWithFilterCollectionData() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Samsung", 1300f));
        products.add(new Product(2, "Nokia", 1400f));
        products.add(new Product(3, "Realme", 1500f));
        products.add(new Product(4, "Moto", 1100f));
        products.stream().filter(product -> product.getPrice()>1300).forEach(product -> System.out.println(product.getName()+":"+product.getPrice()));
    }

}

interface FunInterface{
    void fun1(int x);
    default void fun2(){
        System.out.println("function2");
    }
}
