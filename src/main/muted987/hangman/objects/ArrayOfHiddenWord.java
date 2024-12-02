package main.muted987.hangman.objects;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfHiddenWord {

    private final ArrayList<String> stars;

    public ArrayOfHiddenWord(List<String> word) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= word.size() - 1; i++) {
            result.add("*");
        }
        this.stars = result;
    }
    public boolean isAnyStar() {
        return stars.contains("*");
    }
    public ArrayList<String> getArrayOfHiddenWord() {
        return stars;
    }
    public void replaceStarToLetter(String letter, int index){
        stars.set(index, letter);
    }
    public void hiddenWordArrayRender(ArrayOfHiddenWord stars) {
        System.out.println(stars.getArrayOfHiddenWord());
    }
}
