import java.util.Scanner;

public class DataTypesInfo {
    public static void main(String[] args) {
        System.out.println("Інформація про примітивні типи даних:\n");

        System.out.println("byte: розмір = " + Byte.BYTES + " байт, мін = " + Byte.MIN_VALUE + ", макс = " + Byte.MAX_VALUE);
        System.out.println("short: розмір = " + Short.BYTES + " байт, мін = " + Short.MIN_VALUE + ", макс = " + Short.MAX_VALUE);
        System.out.println("int: розмір = " + Integer.BYTES + " байт, мін = " + Integer.MIN_VALUE + ", макс = " + Integer.MAX_VALUE);
        System.out.println("long: розмір = " + Long.BYTES + " байт, мін = " + Long.MIN_VALUE + ", макс = " + Long.MAX_VALUE);
        System.out.println("float: розмір = " + Float.BYTES + " байт, мін = " + Float.MIN_VALUE + ", макс = " + Float.MAX_VALUE);
        System.out.println("double: розмір = " + Double.BYTES + " байт, мін = " + Double.MIN_VALUE + ", макс = " + Double.MAX_VALUE);
        System.out.println("char: розмір = " + Character.BYTES + " байт, мін = " + (int) Character.MIN_VALUE + ", макс = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: значення = true або false");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведіть ціле число (int):");
        int intVal = Integer.parseInt(sc.nextLine());
        System.out.println("Ви ввели int: " + intVal);

        System.out.println("\nВведіть число з комою (double):");
        double doubleVal = Double.parseDouble(sc.nextLine());
        System.out.println("Ви ввели double: " + doubleVal);

        System.out.println("\nВведіть символ (char):");
        char charVal = sc.nextLine().charAt(0);
        System.out.println("Ви ввели char: " + charVal);

        System.out.println("\nВведіть true або false (boolean):");
        boolean boolVal = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Ви ввели boolean: " + boolVal);

        sc.close();
    }
}
