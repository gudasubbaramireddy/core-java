package java8features.streams;

import java8features.lambda.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        withOutStream();
        withStream();

        //Stream iterating
       Stream.iterate(1,integer -> integer+1).filter(integer -> integer%5==0).limit(7).forEach(System.out::print);
           }



    private static void withOutStream() {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList = new ArrayList<Float>();

        for (Product product:productsList){
            // filtering data of list
            if(product.getPrice()<30000){
                productPriceList.add(product.getPrice());    // adding price to a productPriceList
            }
        }
        System.out.println(productPriceList);   // displaying data
    }
    private static void withStream() {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        System.out.println(productsList.stream().filter(product -> product.getPrice()<30000).map(Product::getPrice).collect(Collectors.toList()));

        //filtering & iterating
        productsList.stream().filter(product -> product.getPrice()==30000).forEach(product -> System.out.println("product name:"+product.getName()));

        //reduce() method
        System.out.println("this is reduce method"+productsList.stream().map(Product::getPrice).reduce(0.0f, Float::sum));

        //collectors method
        System.out.println(productsList.stream().collect((Collectors.summingDouble(Product::getPrice))));

        //list to set

        Set<Float> productPriceList =
                productsList.stream()
                        .filter(product->product.getPrice() < 30000)   // filter product on the base of price
                        .map(Product::getPrice)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)

        // Converting Product List into a Map
        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.getId(), p->p.getName()));
    }
}
