package main.muted987.hangman;

import main.muted987.hangman.objects.ArrayOfHiddenWord;
import main.muted987.hangman.objects.ArrayOfIncorrectLetters;
import main.muted987.hangman.objects.ArrayOfInputLetters;
import main.muted987.hangman.objects.Word;

public class Game {

    private final String language = GameStart.start();
    private int amountOfInputs = 0;
    private int amountOfMistake = 0;
    private final Word word = new Word(language);
    private  final ArrayOfHiddenWord starsArray = new ArrayOfHiddenWord(word.getWord());
    private final ArrayOfIncorrectLetters arrayOfIncorrectLetters = new ArrayOfIncorrectLetters();
    private final ArrayOfInputLetters arrayOfInputLetters = new ArrayOfInputLetters();
    public void game() {
        HangmanRender hangmanRender = new HangmanRender();
        while (true) {
            if (amountOfMistake == 7) {
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
            arrayOfInputLetters.arrayOfInputLettersRender();
            starsArray.hiddenWordArrayRender(starsArray);
            String letterInput = Input.inputLetter();
            amountOfInputs++;
            if (arrayOfInputLetters.isLetterNotInArray(letterInput)) arrayOfInputLetters.addLetterToArray(letterInput);
            if (word.getIndexOfLetter(letterInput) != -1) {
                while (word.getIndexOfLetter(letterInput) >= 0) {
                    starsArray.replaceStarToLetter(letterInput, word.getIndexOfLetter(letterInput));
                    word.replaceLetterToStar(word.getIndexOfLetter(letterInput));
                }
            } else {
                if (arrayOfIncorrectLetters.isLetterNotInArray(letterInput)) {
                    System.out.println("Incorrect letter");
                    arrayOfIncorrectLetters.addLetterToArray(letterInput);
                } else {
                    System.out.println("Letter is used before");
                }
                amountOfMistake++;
            }
        }
    }
    public void endOfGame() {
        System.out.println("word was = " + word.wordRender());
        arrayOfIncorrectLetters.arrayOfIncorrectLettersRender();
        System.out.println("--------------------------------------------");
        arrayOfInputLetters.arrayOfInputLettersRender();
        System.out.println("Amount of inputted letters = " + amountOfInputs);
        System.out.println("Amount of mistake = " + amountOfMistake);
    }
}
