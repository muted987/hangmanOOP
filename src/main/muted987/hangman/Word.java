package main.muted987.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Word {

    private final List<String> word;

    public Word(String language) {
        Dictionary dictionary = new Dictionary();
        ArrayList<String> words = dictionary.getWords(language);
        Random rnd = new Random();
        String[] wordArray = words.get(rnd.nextInt(words.size() - 1)).split("");
        this.word = Arrays.asList(wordArray);
    }

    public List<String> getWord() {
        return word;
    }

    public void replaceLetterToStar(int index){
        word.set(index, "*");
    }

    public int getIndexOfLetter(String letter) {
        return word.indexOf(letter);
    }
}
