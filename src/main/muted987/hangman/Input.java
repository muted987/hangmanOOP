package main.muted987.hangman;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);


    public static String inputLetter() {
        while (true) {
            System.out.println("Input letter");
            String inputText = scanner.nextLine();
            if (isInputValid(inputText)) {
                return inputText;
            } else {
                System.out.println("Input invalid. Try again");
            }
        }
    }

    public static int inputOption() {
        while (true) {
            System.out.println("Input option");
            int inputOption = Character.getNumericValue(scanner.nextLine().charAt(0));
            if (!(inputOption > 4 || inputOption < 0)) {
                return inputOption;
            } else {
                System.out.println("Input invalid. Try again");
            }
        }
    }

    public static boolean isInputValid(String inputText) {
        return (inputText.length() == 1) || !("1234567890,!@#$%^&()_+|/\\<>.".contains(inputText));
    }
}
