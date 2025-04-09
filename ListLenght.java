public class ListLenght {
    public static void main(String[] args) {
        int count = 0;
        int index = 0;
        int[] a = {1, 2, 3, -1, 5};

        for (; index < 0; count++) {
            index = a[index];
        }

        System.out.println("Tamanho: " + count);
    }
}
