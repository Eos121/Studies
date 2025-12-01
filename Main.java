import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = Integer.parseInt(sc.nextLine());

        System.out.print("Enter a floating-point number: ");
        double doubleValue = Double.parseDouble(sc.nextLine());

        System.out.print("Enter a string: ");
        String strValue = sc.nextLine();

        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = Boolean.parseBoolean(sc.nextLine());

        System.out.println();

        System.out.println("int = " + intValue + ", double = " + doubleValue + ", str = " + strValue + ", bool = " + boolValue);

        System.out.printf("INT(dec) = %d, DOUBLE = %.3f, STRING = %s, BOOL = %b\n", intValue, doubleValue, strValue, boolValue);

        String s1 = String.format("int hex = %x, oct = %o", intValue, intValue);
        System.out.println(s1);

        System.out.printf("String width 20 = |%20s|\n", strValue);

        System.out.printf("String cut to 5 = %.5s\n", strValue);

        System.out.println("double exp = " + String.format("%.2e", doubleValue));

        System.out.println("boolean = " + boolValue);

        System.out.printf("int with padding = |%10d|\n", intValue);

        System.out.printf("double fixed length = |%10.4f|\n", doubleValue);

        System.out.println(String.format("Combined: %d, %.2f, %s, %b", intValue, doubleValue, strValue, boolValue));

        sc.close();
    }
}
