abstract class AbstractGame {
    public AbstractGame() {

    }

    abstract void makeRandomChoice(double randomChoice);

    public void mainGame() throws Exception {
        RandomInterface r=new LinearCongruentialGenerator();

        for (int i=0; i<2; i++) {
            System.out.println("Hit <RETURN> to pick something!");
            UserInput.getInput();
            double randomChoice = r.next();
            makeRandomChoice(randomChoice);
        }
    }

    abstract void declareGameWinner();

    abstract void initialiseGame();
}
