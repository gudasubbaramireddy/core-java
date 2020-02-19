package java8features;

import java.util.ArrayList;
import java.util.List;

public class NoLambda {

    public static void main(String[] args) {

        int width=10;
        //no lambda expression
        /*Drawable drawable=new Drawable() {
            public void draw(int x,int y) {
                System.out.println("Drawing "+(width+x+y));
            }
        };*/
        //Using lambda
        //Drawable d=()->{System.out.println("draw"+width);};
       // Drawable d=(x,y)->System.out.println("draw"+(width+x+y));
        Drawable ds=(x,y)->(width+x+y);
        System.out.println(ds.draw(10,50));
        List<String> list=new ArrayList<>();
        list.add("ram");
        list.add("raj");
        list.add("geetha");
        //list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }

}

interface Drawable{
    //public void draw();
    public int draw(int x,int y);
}
