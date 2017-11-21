abstract class AbstractGame {
    public AbstractGame() {

    }
    // Define abstract methods to be overriden
    abstract void initialiseGame() throws Exception;

    abstract void makeRandomChoice(double randomChoice);

    abstract void getIntroText();

    public void mainGame() throws Exception {
        RandomInterface r=new LinearCongruentialGenerator();

        for (int i=0; i<2; i++) {
            getIntroText();
            UserInput.getInput();
            double randomChoice = r.next();
            makeRandomChoice(randomChoice);
        }
    }

    abstract void declareGameWinner();
}
