package io.collections._3_lists;

import io.collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int PRODUCT_NOT_PRESENT = -1;

    private final List<Product> products = new ArrayList<>();

    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

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

        // Sorting by weight
        products.sort(Product.BY_WEIGHT);

        // Finding the index of products that require Heavy Van
        int splitPoint = findSplitPoint();

        // Assign the views of the product list for Heavy & Light Vans
        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());

    }

    private int findSplitPoint() {

        for (int i = 0; i < products.size(); i++) {
            final Product product = products.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
