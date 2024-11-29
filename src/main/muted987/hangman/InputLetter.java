package main.muted987.hangman;

import java.util.Scanner;

public class InputLetter {

    public static String input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input letter");
            String inputText = scanner.nextLine();
            if (isInputValid(inputText)) {
                return inputText;
            } else {
                System.out.println("Input invalid. Try again");
                continue;
            }
        }

    }

    public static boolean isInputValid(String inputText) {
        char inputChar = inputText.charAt(0);
        return (inputText.length() != 1 || "1234567890,!@#$%^&()_+|/\\<>.".indexOf(inputChar) != -1);
    }
}
