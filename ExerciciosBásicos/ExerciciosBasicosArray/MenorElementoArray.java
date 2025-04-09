package ExerciciosBásicos.ExerciciosBasicosArray;

public class MenorElementoArray {
    public static void main(String[] args) {
        int[] array = {1, 10, -2, 15, -30};

        int numeroMenor = array[0];
        for (int a = 0; a < array.length; a++){
            if (array[a] < numeroMenor){
                numeroMenor = array[a];
            }


        }
        System.out.println("O menor número é: " + numeroMenor);
    }
}
