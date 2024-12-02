package main.muted987.hangman;

import java.util.ArrayList;

public class Game {

    private final String language = GameStart.start();
    private int amountOfInputs = 0;
    private int mistakeCount = 0;
    private final Word word = new Word(language);
    private  final ArrayOfHiddenWord starsArray = new ArrayOfHiddenWord(word.getWord());
    private final ArrayList<String> arrayOfIncorrectLetters = new ArrayList<>();
    public void game() {
        HangmanRender hangmanRender = new HangmanRender();
        while (true) {
            if (mistakeCount == 8) {
                System.out.println("GAME OVER");
                endOfGame();
                break;
            }
            if (!starsArray.isAnyStar()) {
                System.out.println("You win!");
                endOfGame();
                break;
            }
            hangmanRender.render(mistakeCount);
            starsArray.starsArrayRender(starsArray);
            String letterInput = Input.inputLetter();
            while (true) {
                if (word.getIndexOfLetter(letterInput) != -1) {
                    amountOfInputs++;
                    starsArray.replaceStarToLetter(letterInput, word.getIndexOfLetter(letterInput));
                    word.replaceLetterToStar(word.getIndexOfLetter(letterInput));
                } else {
                    System.out.println("Incorrect letter");
                    arrayOfIncorrectLetters.add(letterInput);
                    mistakeCount++;
                    break;
                }
            }
            amountOfInputs++;
        }
    }

    public void endOfGame() {
        System.out.println("word was = " + word);
        System.out.println(arrayOfIncorrectLetters);
        System.out.println("Amount of inputted letters = " + amountOfInputs);
        System.out.println("Amount of mistake = " + amountOfInputs);
    }
}
