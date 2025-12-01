import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (day month year): ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter second date (day month year): ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (y1 == y2) {
            if (m1 == m2) {
                if (d1 == d2) {
                    System.out.println("Dates are equal");
                } else if (d1 < d2) {
                    System.out.println("First date is earlier");
                } else {
                    System.out.println("Second date is earlier");
                }
            } else if (m1 < m2) {
                System.out.println("First date is earlier");
            } else {
                System.out.println("Second date is earlier");
            }
        } else if (y1 < y2) {
            System.out.println("First date is earlier");
        } else {
            System.out.println("Second date is earlier");
        }

        sc.close();
    }
}
