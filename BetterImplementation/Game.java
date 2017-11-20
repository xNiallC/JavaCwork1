import java.io.*;
import java.util.*;

public class Game {
    public static void playGame(GameType game) throws Exception {
        AbstractGame newGame = GameFactory.createNewGame(game);

    }


    public static void main (String[] args) {
        System.out.print("Card (c) or Die (d) game? ");
        userChosenGame = UserInput.getInput();
        playGame(userChosenGame);
    }
}