package main.muted987.hangman.objects;

import java.util.ArrayList;

public abstract class ArrayOfLetters {
    protected ArrayList<String> arrayOfLetters = new ArrayList<>();
    public void addLetterToArray(String letter) {
        this.arrayOfLetters.add(letter);
    }
    public boolean isLetterNotInArray(String letter) {
        return !arrayOfLetters.contains(letter);
    }
    public String arrayToString() {
        StringBuilder outputLine = new StringBuilder();
        for (String letter : arrayOfLetters) {
            outputLine.append(letter).append(", ");
        }
        return outputLine.substring(0, arrayOfLetters.size() * 3 - 2);
    }
}
