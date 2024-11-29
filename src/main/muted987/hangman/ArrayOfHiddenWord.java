package main.muted987.hangman;

import java.util.ArrayList;

public class ArrayOfHiddenWord {

    private ArrayList<String> stars = new ArrayList<>();

    public ArrayOfHiddenWord(String word) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= word.length() - 1; i++) {
            result.add("*");
        }
        this.stars = result;
    }
    public int getIndexOfLetterInWord(String letter) {
        return stars.indexOf(letter);
    }
    public ArrayList<String> getArrayOfHiddenWord() {
        return stars;
    }
    public void replaceStarToLetter(String letter, int index){
        stars.set(index, letter);
    }
}
