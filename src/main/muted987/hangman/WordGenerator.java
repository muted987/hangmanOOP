package main.muted987.hangman;

import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {
    static String wordGenerator(String language) {
        Dictionary dictionary = new Dictionary();
        ArrayList<String> words = dictionary.getWords(language);
        Random rnd = new Random();
        return words.get(rnd.nextInt(words.size() - 1));

    }
}
