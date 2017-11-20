public class GameFactory {
    private enum GameType {
            d, c;
    }

    public static AbstractGame createNewGame(String userInput) {
        GameType userGameChoice = GameType.valueOf(userInput);
        switch(userGameChoice) {
            case d:
                return new DieGame();
            case c:
                return new CardGame();
        }
        return new DieGame();
    }
}