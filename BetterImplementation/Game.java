import java.io.*;
import java.util.*;

public class Game {
    public static void playGame(String game) throws Exception {
        AbstractGame newGame = GameFactory.createNewGame(game);
        newGame.initialiseGame();
        newGame.mainGame();
        newGame.declareGameWinner();
    }

    public static void main (String[] args) throws Exception {
        System.out.print("Card (c) or Die (d) game? ");
        String userChosenGame = UserInput.getInput();
        playGame(userChosenGame);
    }
}