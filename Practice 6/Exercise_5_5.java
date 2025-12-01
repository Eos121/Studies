import java.util.Scanner;
import java.util.Random;

public class Exercise_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Розмір масиву: ");
        int n = sc.nextInt();

        System.out.print("1 - зростання, 2 - спадання: ");
        int mode = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = r.nextInt(100);

        boolean ok = true;

        if (mode == 1) {
            for (int i = 0; i < n - 1; i++)
                if (a[i] > a[i + 1]) ok = false;
        } else {
            for (int i = 0; i < n - 1; i++)
                if (a[i] < a[i + 1]) ok = false;
        }

        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
        System.out.println();
        System.out.println(ok ? "Yes" : "No");
    }
}
