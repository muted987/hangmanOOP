package main.muted987.hangman;

public class GameStart {
    private static String language = "Russian";
    public static String start() {
        while (true) {
            String gameStartMessage = "1. Start new game (current language is %s)\n2. Change game language (default Russian)\n3. Exit\n";
            System.out.printf(gameStartMessage, language);
            int option = Input.inputOption();
            if (option == 1) {
                return language;
            } else if (option == 2){
                String languageChangeSettings = "Choose language\n1. Russian\n2. English\n3. Back";
                System.out.println(languageChangeSettings);
                int languageOption = Input.inputOption();
                if (languageOption == 2) {
                    language = "English";
                }
            } else {
                System.out.println("Shut down the game. Good luck!");
                System.exit(1);
            }
        }
    }
}
