import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = sc.nextDouble();

        System.out.print("Введите b: ");
        double b = sc.nextDouble();

        System.out.print("Введите x: ");
        double x = sc.nextDouble();

        double fx;

        if (x >= 0 && x < 1) {
            fx = b * x * x + x - 6;
        } 
        else if (x == 1) {
            fx = 1.0 / Math.sqrt(a * x + b);
        } 
        else if (x > 1 && x < 9) {
            fx = Math.cos(x);
        } 
        else {
            System.out.println("x вне области определения!");
            return;
        }

        System.out.println("f(x) = " + fx);

        sc.close();
    }
}
