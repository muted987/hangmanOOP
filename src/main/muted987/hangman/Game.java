package main.muted987.hangman;

public class Game {
    public void game() {
        HangmanRender hangmanRender = new HangmanRender();
        String language = "russian";
        String word = WordGenerator.wordGenerator(language);
        ArrayOfHiddenWord starsArray = new ArrayOfHiddenWord(word);
        ArrayOfStarsRender starsRender = new ArrayOfStarsRender();
        int mistakeCount = 0;
        while (true) {
            hangmanRender.render(mistakeCount);
            starsRender.starsArrayRender(starsArray);
            String letterInput = InputLetter.input();
            if (word.contains(letterInput)) {
                starsArray.replaceStarToLetter(letterInput, starsArray.getIndexOfLetterInWord(letterInput));
            } else {
                System.out.println("Incorrect letter");
                mistakeCount++;
            }
        }
    }
}
