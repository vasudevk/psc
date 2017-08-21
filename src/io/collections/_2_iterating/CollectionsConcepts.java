//package io.collections._2_iterating;
//
//import io.collections.Product;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
///**
// * Created by Vasudev on 7/24/2017.
// */
//public class CollectionsConcepts
//{
//    public static void main(String[] args)
//    {
//        Product door = new Product(id, "Wooden Door", 35);
//        Product floorPanel = new Product(id, "Floor Panel", 25);
//        Product window = new Product(id, "Glass Window", 10);
//
//        Collection<Product> products = new ArrayList<>();
//        products.add(door);
//        products.add(floorPanel);
//        products.add(window);
//
//        // Using Iterator
//        final Iterator<Product> productIterator = products.iterator();
//        while (productIterator.hasNext()) {
//            Product product = productIterator.next();
//            if (product.getWeight() > 20)
//            {
//                System.out.println(product);
//            }
//            else
//            {
//                productIterator.remove();
//            }
//        }
//        System.out.println(products.size());
//        System.out.println(products.isEmpty());
//        System.out.println(products.contains(window));
//        System.out.println(products.contains(door));
//
//        Collection<Product> otherProducts = new ArrayList<>();
//        otherProducts.add(window);
//        otherProducts.add(door);
//
//        products.removeAll(otherProducts);
//        products.remove(window);
//
//        System.out.println(products);
//
//
//
//
//        /* Since Java 5, use For-each loop
//         these are clean but iterator supports extra functionality.
//                for (Product product : products)
//                {
//                    System.out.println(product);
//                }*/
//    }
//}
