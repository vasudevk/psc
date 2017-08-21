package io.collections._4_sets;

import io.collections.Product;
import io.collections.Supplier;

import java.util.*;

import static io.collections.Product.BY_NAME;
import static io.collections.Product.BY_WEIGHT;

public class ProductCatalogue implements Iterable<Product> {

    private final SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);

    //    private final Set<Product> products = new TreeSet<>(BY_NAME);

    //    private final Set<Product> products = new HashSet<>();
    public void isSuppliedBy(Supplier supplier) {

        products.addAll(supplier.products());

    }

    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public SortedSet<Product> lightVanProducts() {

        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.headSet(heaviestLightVanProduct);
    }


    public SortedSet<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.tailSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {

        for (Product product : products) {
            if (product.getWeight() < 20) {
                return product;
            }
        }
        return products.last();
    }
}

