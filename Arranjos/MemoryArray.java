package Arranjos;

import java.util.Arrays;

class MemoryArray {
    public static void main(String[] args) {
        int[] a = { 10 };
        increment(a);
        System.out.println(a[0]);
        int b = 10;
        alteratedIncrement(b);
        System.out.println("-------------------");
        System.out.println(b);
    }

    private static void increment(int[] array){
        array[0]++;
    }

    private static void alteratedIncrement(int x) {
        x++;
    }
}
