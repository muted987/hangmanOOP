package main.muted987.hangman;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);
    public static String inputLetter() {
        while (true) {
            System.out.println("Input letter");
            String inputText = scanner.nextLine();
            if (isInputValid(inputText)) {
                return inputText.toLowerCase();
            } else {
                System.out.println("Input invalid. Try again");
            }
        }
    }
    public static int inputOption() {
        while (true) {
            System.out.println("Input option");
            String inputOption = scanner.nextLine();
            if (inputOption.length() == 1) {
                int option = Character.getNumericValue(inputOption.charAt(0));
                if (!(option > 3 || option <= 0)) {
                    return option;
                }
                else {
                    System.out.println("Input invalid. Try again");
                }
            } else {
                System.out.println("Input invalid. Try again");
            }
        }
    }
    public static boolean isInputValid(String inputText) {
        return (inputText.length() == 1) && !("1234567890,!@#$%^&()_+|/\\<>.".contains(inputText));
    }
}
