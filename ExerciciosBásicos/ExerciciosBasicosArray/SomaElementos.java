package ExerciciosBásicos.ExerciciosBasicosArray;

import java.util.Scanner;

public class SomaElementos {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int soma = 0;
        for(int a = 0; a < array.length; a++){
            soma += array[a];
        }

        System.out.println("Soma dos valores: " + soma);
    }
}
