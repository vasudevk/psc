package io.collections._6_maps;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {

    public static void main(String[] args) {

        final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);


        // getOrDefault()
        Product result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(10));


        // replace()
        Product result_replace = idToProduct.replace(1, new Product(1, "Big Door", 50));
        System.out.println(result_replace);
        System.out.println(idToProduct.get(1));


        // replaceAll()
        System.out.println(idToProduct);
        idToProduct.replaceAll((id, oldProduct) ->
                new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);


        // computeIfAbsent()
        // if key = 2, compute wont be executed since there is an element present with that key.
        System.out.println(idToProduct);
        Product result_compAbsent = idToProduct
                .computeIfAbsent(10, (id) -> new Product(id, "Customer Product", 10));
        System.out.println(result_compAbsent);
        System.out.println(idToProduct.get(10));


        // forEach()
        System.out.println(idToProduct);
        idToProduct.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

    }
}
