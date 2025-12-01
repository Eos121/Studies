import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Информация о примитивных типах данных:");
        System.out.println("byte: размер = " + Byte.BYTES + " байт, min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE);
        System.out.println("short: размер = " + Short.BYTES + " байт, min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE);
        System.out.println("int: размер = " + Integer.BYTES + " байт, min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE);
        System.out.println("long: размер = " + Long.BYTES + " байт, min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
        System.out.println("float: размер = " + Float.BYTES + " байт, min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE);
        System.out.println("double: размер = " + Double.BYTES + " байт, min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE);
        System.out.println("char: размер = " + Character.BYTES + " байт, min = " + (int)Character.MIN_VALUE + ", max = " + (int)Character.MAX_VALUE);
        System.out.println("boolean: размер ~1 байт, значения: true / false");

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Введите целое число (int): ");
        String intStr = sc.nextLine();
        int intValue = Integer.parseInt(intStr);
        System.out.println("int = " + intValue);

        System.out.print("Введите число с точкой (double): ");
        String doubleStr = sc.nextLine();
        double doubleValue = Double.parseDouble(doubleStr);
        System.out.println("double = " + doubleValue);

        System.out.print("Введите символ (char): ");
        String charStr = sc.nextLine();
        char ch = charStr.charAt(0);
        System.out.println("char = " + ch);

        System.out.print("Введите true/false (boolean): ");
        String boolStr = sc.nextLine();
        boolean boolValue = Boolean.parseBoolean(boolStr);
        System.out.println("boolean = " + boolValue);

        sc.close();
    }
}
