import java.io.*;
import java.util.*;

public class Game {
    // The BufferedReader used throughout
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    public static void playGame(GameType game) throws Exception {
        AbstractGame newGame = GameFactory.createNewGame(game);
    }


    public static void main (String[] args) {

    }
}