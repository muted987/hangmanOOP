package main.muted987.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dictionary {
    public ArrayList<String> getWords(String language) {
        ArrayList<String> words = new ArrayList<>();
        try {
            BufferedReader br = (language.equals("English")) ? new BufferedReader(new FileReader("src/main/resources/english_nouns.txt")) : new BufferedReader(new FileReader("src/main/resources/russian_nouns.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return words;
    }
}
