public class GameFactory {
    public enum GameType = {Dice, Card};

    public static AbstractGame createNewGame(GameType type) {
        switch(type) {
            case GameType.Dice:
                return new DiceGame();
                break;
            case GameType.Card:
                return new CardGame();
                break;
        }
    }
}