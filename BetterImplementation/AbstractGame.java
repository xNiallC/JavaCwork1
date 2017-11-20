abstract class AbstractGame {
    public AbstractGame() {

    }
    abstract void initialiseGame();

    abstract void makeRandomChoice(int randomChoice);

    public static void mainGame() {
        public static RandomInterface r=new LinearCongruentialGenerator();

        for (int i=0; i<2; i++) {
            System.out.println("Hit <RETURN> to pick something!");
            UserInput.getInput();
            int randomChoice = r.next();
            makeRandomChoice(randomChoice);
        }
    }

    abstract void declareGameWinner();
}
