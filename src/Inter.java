public interface Inter {
    int a = 10;

    default void display() {
        System.out.println("hello");
    }
}
 class MTestClass implements Inter{

     public static void main(String[] args) {
        MTestClass mTestClass=new MTestClass();
        mTestClass.display();
     }
}
