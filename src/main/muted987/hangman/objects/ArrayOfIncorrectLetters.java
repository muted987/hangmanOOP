package main.muted987.hangman.objects;

import java.util.ArrayList;

public class ArrayOfIncorrectLetters {

    private final ArrayList<String> arrayOfIncorrectLetters = new ArrayList<>();

    public void addLetterToArray(String letter) {
        arrayOfIncorrectLetters.add(letter);
    }


    public boolean letterNotInMistakeArray(String letter) {
        return !arrayOfIncorrectLetters.contains(letter);
    }

    public void arrayOfIncorrectLettersRender() {
        if (arrayOfIncorrectLetters.size() != 0) {
            System.out.println("Incorrect letters are " + arrayOfIncorrectLettersToString());
        } else {
            System.out.println("There is no incorrect letters");
        }
    }

    public String arrayOfIncorrectLettersToString(){
        StringBuilder outputLine = new StringBuilder();
        for (String letter : arrayOfIncorrectLetters) {
            outputLine.append(letter).append(", ");
        }
        return outputLine.substring(0, arrayOfIncorrectLetters.size() * 3 - 2);
    }

}
