package io.demo;

public class Demo_Overloading {

    public static void main(String args[]) {

        System.out.println(demoX("My","Class"));
        System.out.println(demoY(1,5,"Result"));
    }

    private static int demoY(int i, int j, String k) {
        int x = i+j;
        return x;
    }

    private static String demoX(String i, String j) {
        String x = i + j;
        return x;
    }
}
