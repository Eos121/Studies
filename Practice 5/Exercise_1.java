public class Exercise_1 {
    public static void main(String[] args) {

        double a = 1.1;
        double b = 0.2;
        double c = 0.004; // 4 * 10^-3

        double x = Math.pow(Math.sin(b*b + a*a), 3) - Math.sqrt(b / c);
        double y = (b*b) / a + Math.pow(Math.cos(b + c), 3);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
