import java.io.*;
import java.util.*;

class DieGame extends AbstractGame {
    private HashSet<Integer> numbersRolled;

    public DieGame() {
        this.numbersRolled = new HashSet<Integer>();
    }

    void initialiseGame() {
        // Nothing to do
        System.out.println("hello");
    }

    void makeRandomChoice(double randomChoice) {
        int dieRoll = (int)(randomChoice * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        numbersRolled.add(new Integer(dieRoll));
    }

    void declareGameWinner() {
        // Declare the winner:

        // User wins if at least one of the die rolls is a 1
        if (numbersRolled.contains(new Integer(1))) {
            System.out.println("You won!");
        }
        else System.out.println("You lost!");
    }
}