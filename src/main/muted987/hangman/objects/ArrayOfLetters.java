package main.muted987.hangman.objects;

import java.util.ArrayList;

public abstract class ArrayOfLetters {
    private static final String LETTER_IS_USED_BEFORE_CAPTION = "Letter is used before";
    protected ArrayList<String> arrayOfLetters = new ArrayList<>();
    public void addLetterToArray(String letter) {
        if (isLetterNotInArray(letter)) {
            this.arrayOfLetters.add(letter);
        } else {
            System.out.println(LETTER_IS_USED_BEFORE_CAPTION);
        }
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
