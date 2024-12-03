package main.muted987.hangman;

import main.muted987.hangman.objects.ArrayOfHiddenWord;
import main.muted987.hangman.objects.ArrayOfIncorrectLetters;
import main.muted987.hangman.objects.ArrayOfInputLetters;
import main.muted987.hangman.objects.Word;

public class Game {

    private static final String EXIT_CODE = "EXIT";
    private static final String LINE_OF_UNDERLINES = "--------------------------------------------";
    private static final String WORD_WAS = "word was = ";
    private static final String WIN_MESSAGE = "YOU WIN!";
    private static final String GAME_OVER_MESSAGE = "GAME OVER";
    private static final String AMOUNT_OF_INPUT_LETTERS_CAPTION = "Amount of inputted letters = ";
    private static final String AMOUNT_OF_MISTAKE_LETTERS_CAPTION = "Amount of mistake = ";

    private static int amountOfInputs = 0;
    private static int amountOfMistake = 0;
    private static final ArrayOfIncorrectLetters arrayOfIncorrectLetters = new ArrayOfIncorrectLetters();
    private static final ArrayOfInputLetters arrayOfInputLetters = new ArrayOfInputLetters();
    public void game() {
        while (true) {
            String language = GameStart.start();
            if (language.equals(EXIT_CODE)) break;
            Word word = new Word(language);
            ArrayOfHiddenWord starsArray = new ArrayOfHiddenWord(word.getWord());
            HangmanRender hangmanRender = new HangmanRender();
            while (true) {
                if (amountOfMistake == 7) {
                    System.out.println(GAME_OVER_MESSAGE);
                    endOfGame(word);
                    break;
                }
                if (!starsArray.isAnyStar()) {
                    System.out.println(WIN_MESSAGE);
                    endOfGame(word);
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
                    arrayOfIncorrectLetters.addLetterToArray(letterInput);
                    amountOfMistake++;
                }
            }
        }
    }
    public void endOfGame(Word word) {
        System.out.println(WORD_WAS + word.wordRender());
        System.out.println(LINE_OF_UNDERLINES);
        arrayOfIncorrectLetters.arrayOfIncorrectLettersRender();
        arrayOfInputLetters.arrayOfInputLettersRender();
        System.out.println(LINE_OF_UNDERLINES);
        System.out.println(AMOUNT_OF_INPUT_LETTERS_CAPTION + amountOfInputs);
        System.out.println(AMOUNT_OF_MISTAKE_LETTERS_CAPTION + amountOfMistake);
        System.out.println(LINE_OF_UNDERLINES);
    }
}
