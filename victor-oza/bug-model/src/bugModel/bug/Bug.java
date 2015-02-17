package bugModel.bug;

import bugModel.results.Results;
import bugModel.results.Display;

public class Bug implements AllDirectionsBug {

    private Results res;

    public Bug(){
        System.err.println("Usage: Need to provide a Results type object for Bug.\n IE: Bug(Results res).\n");
        System.exit(1);    
    }

    public Bug(Results resIn){
        res = resIn;
    }

    public Bug(Display resIn){
        res = (Results) resIn;
    }

    public void moveRight(){
        res.addToList(1);
    }

    public void moveLeft(){
        res.addToList(2);
    }

    public void moveUp(){
        res.addToList(3);
    }

    public void moveDown(){
        res.addToList(4);
    }

    public void undoPrev(){
        res.undoLastMove();
    }

    public String toString() {
        String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
        return retValue;
    }

}