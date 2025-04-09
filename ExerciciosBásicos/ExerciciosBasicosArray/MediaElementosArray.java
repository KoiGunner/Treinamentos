package ExerciciosBásicos.ExerciciosBasicosArray;

public class MediaElementosArray {
    public static void main(String[] args){
        int[] numeros = {10, 20, 30, 40, 50};

        int media = 0;
        int soma = 0;
        for (int a = 0; a < numeros.length; a++){
            soma += numeros[a];
        }
        media = soma / numeros.length;
        System.out.println("Media: " + media);
    }
}
