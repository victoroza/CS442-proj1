package bugModel.bug;

import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.util.Debug;

public class Bug implements AllDirectionsBug {

    private Results res;

    public Bug(){
        Debug.printToStdout(4, "Bug default Constuctor Called.");
        System.err.println("Usage: Need to provide a Results type object for Bug.\n IE: Bug(Results res).\n");
        System.exit(1);    
    }

    public Bug(Results resIn){
        Debug.printToStdout(4, "Bug Constuctor Called.");
        res = resIn;
    }

    public Bug(Display resIn){
        Debug.printToStdout(4, "Bug Constuctor Called.");
        res = (Results) resIn;
    }

    public void moveRight(){
        Debug.printToStdout(3, "Bug moveRight method called.");
        res.addToList(1);
    }

    public void moveLeft(){
        Debug.printToStdout(3, "Bug moveLeft method called.");
        res.addToList(2);
    }

    public void moveUp(){
        Debug.printToStdout(3, "Bug moveUp method called.");
        res.addToList(3);
    }

    public void moveDown(){
        Debug.printToStdout(3, "Bug moveDown method called.");
        res.addToList(4);
    }

    public void undoPrev(){
        Debug.printToStdout(3, "Bug undoPrev method called.");
        res.undoLastMove();
    }

    public String toString() {
        Debug.printToStdout(3, "Bug toString method called.");
        String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
        return retValue;
    }

}