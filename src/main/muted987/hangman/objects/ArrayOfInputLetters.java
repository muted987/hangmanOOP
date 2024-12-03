package main.muted987.hangman.objects;

public class ArrayOfInputLetters extends ArrayOfLetters {
    public void arrayOfInputLettersRender() {
        if (arrayOfLetters.size() != 0) {
            System.out.println("Inputted letters are " + arrayToString());
        } else {
            System.out.println("There is no inputted letters");
        }
    }
}
