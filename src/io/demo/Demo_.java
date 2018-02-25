package io.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo_ {

    public static void main(String args[]) {

        List aList = new ArrayList();

        // Java 5 features

        // Generics enable type safe checks. Avoid Runtime errors by checking these at compile time
        List<String> bList = new ArrayList<>();

        // Enchanced for-loop
        for(String a : bList) {}

        // Autoboxing/unboxing - int, double, long are primitive DT which cannot be inserted into a list/map etc.
        // Java converts these primitives to wrapper calsses.

        // ENUMS
        // Static imports

        // JAVA 7 features - multiple try-catch blocks

        // Implements -> interface
        // Extends -> class
    }
}
