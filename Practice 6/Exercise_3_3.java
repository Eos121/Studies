import java.util.Scanner;
import java.util.Random;

public class Exercise_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Розмір масиву: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) a[i] = r.nextInt(100);

        System.out.print("Значення для пошуку: ");
        int x = sc.nextInt();

        System.out.print("Нове значення: ");
        int y = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == x) a[i] = y;
        }

        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
    }
}
