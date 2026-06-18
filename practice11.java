import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class HangmanGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] easyWords = {"cat", "house", "apple", "mouse", "man"};
        String[] mediumWords = {"school", "car", "teacher", "phone"};
        String[] hardWords = {"program", "algorithm", "computer", "java"};

        String secretWord = "";

        try {

            System.out.println("Hangman Game");
            System.out.println("1 - Easy");
            System.out.println("2 - Medium");
            System.out.println("3 - Hard");

            int difficulty;

            try {
                difficulty = input.nextInt();
                input.nextLine();

                if (difficulty < 1 || difficulty > 3) {
                    throw new IllegalArgumentException("Wrong difficulty");
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to enter number");
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

            if (difficulty == 1) {
                secretWord = easyWords[rand.nextInt(easyWords.length)];
            } else if (difficulty == 2) {
                secretWord = mediumWords[rand.nextInt(mediumWords.length)];
            } else {
                secretWord = hardWords[rand.nextInt(hardWords.length)];
            }

            char[] guessedWord = new char[secretWord.length()];

            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '_';
            }

            char[] enteredLetters = new char[50];
            int enteredCount = 0;

            int mistakes = 0;
            int maxMistakes = 6;

            boolean isWin = false;

            while (mistakes < maxMistakes && !isWin) {

                drawHangman(mistakes);

                System.out.print("\nWord: ");

                for (int i = 0; i < guessedWord.length; i++) {
                    System.out.print(guessedWord[i] + " ");
                }

                System.out.println();
                System.out.println("Errors: " + mistakes + "/" + maxMistakes);

                try {

                    System.out.print("Enter letter: ");

                    String userInput = input.nextLine();

                    if (userInput.length() == 0) {
                        throw new IllegalArgumentException("Empty input");
                    }

                    if (userInput.length() > 1) {
                        throw new IllegalArgumentException("Only one letter");
                    }

                    char guess = Character.toLowerCase(userInput.charAt(0));

                    if (!Character.isLetter(guess)) {
                        throw new IllegalArgumentException("Only letters allowed");
                    }

                    boolean alreadyEntered = false;

                    for (int i = 0; i < enteredCount; i++) {
                        if (enteredLetters[i] == guess) {
                            alreadyEntered = true;
                            break;
                        }
                    }

                    if (alreadyEntered) {
                        throw new IllegalArgumentException("Letter already used");
                    }

                    enteredLetters[enteredCount] = guess;
                    enteredCount++;

                    boolean isFound = false;

                    for (int i = 0; i < secretWord.length(); i++) {

                        if (secretWord.charAt(i) == guess) {
                            guessedWord[i] = guess;
                            isFound = true;
                        }
                    }

                    if (!isFound) {
                        System.out.println("No letter");
                        mistakes++;
                    }

                    isWin = true;

                    for (int i = 0; i < guessedWord.length; i++) {

                        if (guessedWord[i] == '_') {
                            isWin = false;
                            break;
                        }
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            drawHangman(mistakes);

            if (isWin) {
                System.out.println("\nYou win");
                System.out.println("Word: " + secretWord);
            } else {
                System.out.println("\nYou lose");
                System.out.println("Word was: " + secretWord);
            }

        } catch (Exception e) {
            System.out.println("Program error");
        }

        input.close();
    }

    static void drawHangman(int mistakes) {

        System.out.println("\n +---+");
        System.out.println(" |   |");

        if (mistakes >= 1)
            System.out.println(" |   O");
        else
            System.out.println(" |");

        if (mistakes >= 2)
            System.out.println(" |   |");
        else
            System.out.println(" |");

        if (mistakes == 3)
            System.out.println(" |  /|");
        else if (mistakes >= 4)
            System.out.println(" |  /|\\");
        else
            System.out.println(" |");

        if (mistakes >= 5)
            System.out.println(" |  / \\");
        else
            System.out.println(" |");

        System.out.println(" |");
        System.out.println("=======");
    }
}
