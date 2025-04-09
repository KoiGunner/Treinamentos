package ExerciciosBásicos;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Digite seu número: ");
        a = scanner.nextInt();

        for (int count = 0; count < 11; count++){
            int result = a * count;
            System.out.println(a  + " x " + count + " = " + result);
        }
        scanner.close();
    }
}
