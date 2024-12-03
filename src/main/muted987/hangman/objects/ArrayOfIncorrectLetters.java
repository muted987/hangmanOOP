package main.muted987.hangman.objects;

public class ArrayOfIncorrectLetters extends ArrayOfLetters{
    public void arrayOfIncorrectLettersRender() {
        if (arrayOfLetters.size() != 0) {
            System.out.println("Incorrect letters are " + arrayToString());
        } else {
            System.out.println("There is no incorrect letters");
        }
    }
}
