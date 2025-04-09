package ExerciciosBásicos;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite seu número");
        numero = scanner.nextInt();

        if(numero == 1 ){
            System.out.println("Número ímpar");
        } else if(numero % 2 != 0 && numero <= 5) {
            System.out.println("A");
        } else if(numero >= 6 && numero <= 20) {
            System.out.println("B");
        } else if (numero > 20){
            System.out.println("C");
        } else if(numero % 2 !=0){
            System.out.println("D");
        }

        scanner.close();
    }
}
