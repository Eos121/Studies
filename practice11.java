java
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Hangmann {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] easy = {"cat", "house", "apple", "mouse", "man"};
        String[] medium = {"school", "car", "teacher", "phone"};
        String[] hard = {"program", "algorithm", "computer", "java"};

        String word = "";

        try {

            System.out.println("Hangman Game");
            System.out.println("1 - Easy");
            System.out.println("2 - Medium");
            System.out.println("3 - Hard");

            int choose;

            try {
                choose = scanner.nextInt();
                scanner.nextLine();

                if (choose < 1 || choose > 3) {
                    throw new IllegalArgumentException("Wrong difficulty");
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to enter number");
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

            if (choose == 1) {
                word = easy[random.nextInt(easy.length)];
            } else if (choose == 2) {
                word = medium[random.nextInt(medium.length)];
            } else {
                word = hard[random.nextInt(hard.length)];
            }

            char[] hidden = new char[word.length()];

            for (int i = 0; i < hidden.length; i++) {
                hidden[i] = '_';
            }

            char[] used = new char[50];
            int usedCount = 0;

            int errors = 0;
            int max = 6;

            boolean win = false;

            while (errors < max && !win) {

                draw(errors);

                System.out.print("\nWord: ");

                for (int i = 0; i < hidden.length; i++) {
                    System.out.print(hidden[i] + " ");
                }

                System.out.println();
                System.out.println("Errors: " + errors + "/" + max);

                try {

                    System.out.print("Enter letter: ");

                    String input = scanner.nextLine();

                    if (input.length() == 0) {
                        throw new IllegalArgumentException("Empty input");
                    }

                    if (input.length() > 1) {
                        throw new IllegalArgumentException("Only one letter");
                    }

                    char letter = Character.toLowerCase(input.charAt(0));

                    if (!Character.isLetter(letter)) {
                        throw new IllegalArgumentException("Only letters allowed");
                    }

                    boolean already = false;

                    for (int i = 0; i < usedCount; i++) {
                        if (used[i] == letter) {
                            already = true;
                            break;
                        }
                    }

                    if (already) {
                        throw new IllegalArgumentException("Letter already used");
                    }

                    used[usedCount] = letter;
                    usedCount++;

                    boolean found = false;

                    for (int i = 0; i < word.length(); i++) {

                        if (word.charAt(i) == letter) {
                            hidden[i] = letter;
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No letter");
                        errors++;
                    }

                    win = true;

                    for (int i = 0; i < hidden.length; i++) {

                        if (hidden[i] == '_') {
                            win = false;
                            break;
                        }
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            draw(errors);

            if (win) {
                System.out.println("\nYou win");
                System.out.println("Word: " + word);
            } else {
                System.out.println("\nYou lose");
                System.out.println("Word was: " + word);
            }

        } catch (Exception e) {
            System.out.println("Program error");
        }

        scanner.close();
    }

    static void draw(int errors) {

        System.out.println("\n +---+");
        System.out.println(" |   |");

        if (errors >= 1)
            System.out.println(" |   O");
        else
            System.out.println(" |");

        if (errors >= 2)
            System.out.println(" |   |");
        else
            System.out.println(" |");

        if (errors == 3)
            System.out.println(" |  /|");
        else if (errors >= 4)
            System.out.println(" |  /|\\");
        else
            System.out.println(" |");

        if (errors >= 5)
            System.out.println(" |  / \\");
        else
            System.out.println(" |");

        System.out.println(" |");
        System.out.println("=======");
    }
}
