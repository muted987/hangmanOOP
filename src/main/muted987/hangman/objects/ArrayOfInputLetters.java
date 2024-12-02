package main.muted987.hangman.objects;

import java.util.ArrayList;

public class ArrayOfInputLetters {
    private final ArrayList<String> arrayOfInputLetters = new ArrayList<>();

    public void addLetterToArray(String letter) {
        arrayOfInputLetters.add(letter);
    }
    public boolean isLetterNotUsedBefore(String letter){
        return !arrayOfInputLetters.contains(letter);
    }

    public void arrayOfInputLettersRender() {
        if (arrayOfInputLetters.size() != 0) {
            System.out.println("Incorrect letters are " + arrayOfIncorrectLettersToString());
        } else {
            System.out.println("There is no incorrect letters");
        }
    }

    public String arrayOfIncorrectLettersToString(){
        StringBuilder outputLine = new StringBuilder();
        for (String letter : arrayOfInputLetters) {
            outputLine.append(letter).append(", ");
        }
        return outputLine.substring(0, arrayOfInputLetters.size() * 3 - 2);
    }
}
