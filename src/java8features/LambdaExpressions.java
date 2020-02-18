package java8features;

public class LambdaExpressions {
    //l
    public static void main(String args[]){
        FunInterface funInterface=(int x)->System.out.println(2*x);
        funInterface.fun1(2);
        funInterface.fun2();
    }

}

interface FunInterface{
    void fun1(int x);
    default void fun2(){
        System.out.println("function2");
    }
}
