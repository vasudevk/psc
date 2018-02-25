package io.demo;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Demo_ {

    public static void main(String args[]) {

        List aList = new ArrayList();

        // Java 5 features

        // Generics enable type safe checks. Avoid Runtime errors by checking these at compile time
        List<String> bList = new ArrayList<>();

        // Enchanced for-loop
        for (String a : bList) {
        }

        // Autoboxing/unboxing - int, double, long are primitive DT which cannot be inserted into a list/map etc.
        // Java converts these primitives to wrapper calsses.

        // ENUMS
        // Static imports

        // JAVA 7 features - multiple try-catch blocks

        // Implements -> interface
        // Extends -> class


        // Vector -> Used in threading environment/Supports synchronization
        Vector<String> myVector = new Vector<>();
        myVector.add("Addition");

        // LinkedList -> used in scenarios where frequent updation and deletion occurs.

        String[] myArray = {"a", "b", "c", "d", "e"};

        int removeIndex = 1;
        for (int i = removeIndex; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i+1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(myArray));

        //TODO -> equals() & hashCode() methods

        Model model = new Model("x", "y");


    }
}
