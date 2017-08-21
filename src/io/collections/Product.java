package io.collections;

import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

/**
 * Created by Vasudev on 7/24/2017.
 */
public class Product {

//    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);

//    public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
//        @Override
//        public int compare(final Product p1, final Product p2) {
//            return Integer.compare(p1.getWeight(), p2.getWeight());
//        }
//    };

    public static  final Comparator<Product> BY_WEIGHT =
            comparingInt((Product p) -> p.getWeight()).thenComparingInt((Product p) -> p.getWeight());

    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}
