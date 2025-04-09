package Arranjos;

public class Example {
    public static void main(String[] args) {
        int sum = sum(new int[] { 5, 6, 7 });
        System.out.println(sum);

        int sum2 = newSum(2, 5, 6, 10);
        System.out.println(sum2);
    }

    private static int sum(int[] numbers){
        int sum = 0;
        for(int n : numbers){
            sum +=n;
        }
        return sum;
    }

    private static int newSum(int... numbers){
        int sum = 0;
        for(int n : numbers){
            sum +=n;
        }
        return sum;
    }
}
