package ExerciciosBásicos.ExerciciosBasicosArray;

public class MaiorElementoArray {
    public static void main(String[] args){
        int[] a = {1, 2, 45, 35, 102, 2045, 20};

        int numeroMaior = a[0];
        for (int b = 1; b < a.length; b++){
            if (a[b] > numeroMaior){
                numeroMaior = a[b];
            }
            System.out.println("O número maior é: " + numeroMaior);
        }
    }
}
