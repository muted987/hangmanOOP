package main.muted987.hangman;

public class GameStart {
    private static final String RUSSIAN_LANGUAGE_CAPTION = "Russian";
    private static final String ENGLISH_LANGUAGE_CAPTION = "English";
    private static final String GAME_EXIT_MESSAGE = "Shut down the game. Good luck!";
    private static String language = RUSSIAN_LANGUAGE_CAPTION;
    private static final String GAME_MAIN_MENU_CAPTION = "1. Start new game (current language is %s)\n2. Change game language (default Russian)\n3. Exit\n";
    private static final String GAME_LANGUAGE_CHANGE_MENU_CAPTION = "Choose language\n1. Russian\n2. English\n3. Back";
    private static final int GAME_MAIN_MENU_OPTION = 1;
    private static final int GAME_LANGUAGE_CHANGE_MENU_OPTION = 2;
    private static final int GAME_LANGUAGE_CHOOSE_OPTION = 2;
    public static String start() {
        while (true) {
            System.out.printf(GAME_MAIN_MENU_CAPTION, language);
            int option = Input.inputOption();
            if (option == GAME_MAIN_MENU_OPTION) {
                return language;
            } else if (option == GAME_LANGUAGE_CHANGE_MENU_OPTION){
                System.out.println(GAME_LANGUAGE_CHANGE_MENU_CAPTION);
                int languageOption = Input.inputOption();
                if (languageOption == GAME_LANGUAGE_CHOOSE_OPTION) {
                    language = ENGLISH_LANGUAGE_CAPTION;
                }
            } else {
                System.out.println(GAME_EXIT_MESSAGE);
                System.exit(1);
            }
        }
    }
}
