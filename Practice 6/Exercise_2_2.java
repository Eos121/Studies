import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many angles: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int need = 180 * (n - 2);

        if (sum == need) System.out.println("May exist");
        else System.out.println("Can't exist");
    }
}
