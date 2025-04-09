package ExerciciosBásicos;

import java.util.Scanner;

//Verificador se é par ou impar

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Digite seu número: ");
        a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        scanner.close();
    }
}
