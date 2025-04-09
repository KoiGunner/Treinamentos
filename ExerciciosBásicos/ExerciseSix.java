package ExerciciosBásicos;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int zero = 0;
        int positivo = 0;
        int negativo = 0;

        //Contador para armazenar os números
        for (int a = 0; a < numeros.length; a++){
            System.out.print("Digite um número: ");
            numeros[a] = scanner.nextInt();
        }

        //Contador dos números
        for (int num : numeros){
            if(num > 0){
                positivo++;
            } else if(num < 0){
                negativo++;
            } else {
                zero++;
            }
        }

        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Zeros: " + zero);

        scanner.close();
    }
}
