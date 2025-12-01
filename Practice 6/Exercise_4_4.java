public class Exercise_4_4 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 90; i++) {
            System.out.printf("%.4f ", Math.sin(Math.toRadians(i)));
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
