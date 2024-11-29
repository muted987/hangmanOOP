package main.muted987.hangman;

public class HangmanRender {
    private final String[] HANGMAN_ATTEMPTS_ASCII_IMAGES = {"   +---+\n   |   |\n       |\n       |\n       |\n       |\n       |\n=========", "   +---+\n   |   |\n   O   |\n       |\n       |\n       |\n       |\n=========", "   +---+\n   |   |\n   O   |\n   |   |\n       |\n       |\n       |\n=========", "   +---+\n   |   |\n   O   |\n  /|   |\n       |\n       |\n       |\n=========", "   +---+\n   |   |\n   O   |\n  /|\\  |\n       |\n       |\n       |\n=========", "   +---+\n   |   |\n   O   |\n  /|\\  |\n   |   |\n       |\n       |\n=========", "   +---+\n   |   |\n   O   |\n  /|\\  |\n   |   |\n  /    |\n       |\n=========", "   +---+\n   |   |\n   O   |\n  /|\\  |\n   |   |\n  / \\  |\n       |\n========="};

    public void render(int mistakeCount) {
        System.out.println(HANGMAN_ATTEMPTS_ASCII_IMAGES[mistakeCount]);
    }

}
