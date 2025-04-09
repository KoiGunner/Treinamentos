package Arranjos;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args){
        int[] array = new int[5];
        System.out.println(Arrays.toString(array));

        var array1 = new double[5];
        System.out.println(Arrays.toString(array1));

        var array2 = new String[5];
        System.out.println(Arrays.toString(array2));

        var array3 = new String[] {"Paulo", "Jose", "Fernando"};
        System.out.println(Arrays.toString(array3));

        int[] a = {1, 2, 3, 4 , 5};
        System.out.println(Arrays.toString(a));
    }
}
