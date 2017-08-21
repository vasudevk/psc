package io.collections;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

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

    public static final Comparator<Product> BY_NAME = comparing(Product::getName);

    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);

    // The below method also provides same functionality as above comparingInt
    //            comparingInt((Product p) -> p.getWeight()).thenComparingInt((Product p) -> p.getWeight());

    private final int id;
    private final String name;
    private final int weight;


    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
