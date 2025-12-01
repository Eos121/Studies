import java.util.Random;

public class Exercise_1_1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Парних: " + even);
        System.out.println("Непарних: " + odd);
    }
}
