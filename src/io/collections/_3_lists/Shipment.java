package io.collections._3_lists;

import io.collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int PRODUCT_NOT_PRESENT = -1;

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {

        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT) {
            products.set(index, newProduct);
        }

    }

    public void prepare() {

        //

    }

    public List<Product> getHeavyVanProducts() {
        return null;
    }

    public List<Product> getLightVanProducts() {
        return null;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
