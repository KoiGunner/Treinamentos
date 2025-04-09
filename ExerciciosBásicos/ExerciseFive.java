package ExerciciosBásicos;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu número: ");
        int a = scanner.nextInt();
        int fatorial = 1;

        for (int b = a; b > 0; b--){
            fatorial *= b;
            System.out.println("Resultado: " + a + " x " + b + " = " + fatorial);
        }
    }
}
