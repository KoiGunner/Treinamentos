package ExerciciosBásicos.ExerciciosBasicosArray;

public class ParImparArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        int par = 0;
        int impar = 0;
        for (int a = 0; a < numeros.length; a++) {
            if(numeros[a] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
    }
}
