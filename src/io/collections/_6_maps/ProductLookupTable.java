package io.collections._6_maps;

import io.collections.Product;

public interface ProductLookupTable {

    Product lookupById(int id);

    void addProduct(Product productToAdd);

    void clear();
}
