package main.muted987.hangman;

import java.util.ArrayList;

public class Game {

    private final String language = GameStart.start();
    private int amountOfInputs = 0;
    private int amountOfMistake = 0;
    private final Word word = new Word(language);
    private  final ArrayOfHiddenWord starsArray = new ArrayOfHiddenWord(word.getWord());
    private final ArrayList<String> arrayOfIncorrectLetters = new ArrayList<>();
    public void game() {
        HangmanRender hangmanRender = new HangmanRender();
        while (true) {
            if (amountOfMistake == 8) {
                System.out.println("GAME OVER");
                endOfGame();
                break;
            }
            if (!starsArray.isAnyStar()) {
                System.out.println("You win!");
                endOfGame();
                break;
            }
            hangmanRender.render(amountOfMistake);
            starsArray.hiddenWordArrayRender(starsArray);
            String letterInput = Input.inputLetter();
            amountOfInputs++;
            if (word.getIndexOfLetter(letterInput) != -1) {
                while (word.getIndexOfLetter(letterInput) >= 0) {
                    starsArray.replaceStarToLetter(letterInput, word.getIndexOfLetter(letterInput));
                    word.replaceLetterToStar(word.getIndexOfLetter(letterInput));
                }
            } else {
            System.out.println("Incorrect letter");
            arrayOfIncorrectLetters.add(letterInput);
            amountOfMistake++;
            break;
            }
        }
    }

    public void endOfGame() {
        System.out.println("word was = " + word);
        System.out.println("Incorrect letters = " + arrayOfIncorrectLetters);
        System.out.println("Amount of inputted letters = " + amountOfInputs);
        System.out.println("Amount of mistake = " + amountOfMistake);
    }
}
