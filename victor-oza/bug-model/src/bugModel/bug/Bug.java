package bugModel.bug;

import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.util.Debug;

/** Bug Class which will handle movement
 *
 * @author Victor Oza
 */
public class Bug implements AllDirectionsBug {

    private Results res;

    /** Default bug constructor
     *  Will quit program if called.
     *
     */
    public Bug(){
        Debug.printToStdout(4, "Bug default Constuctor Called.");
        System.err.println("Usage: Need to provide a Results type object for Bug.\n IE: Bug(Results res).\n");
        System.exit(1);    
    }

    /** Explicit bug constructor with Results input
     *
     *  @param resInt Results() object to be used for storage.
     */
    public Bug(Results resIn){
        Debug.printToStdout(4, "Bug Constuctor Called.");
        res = resIn;
    }

    /** Explicit bug constructor with Results (Display) input
     *
     *  @param resInt Results() object to be used for storage.
     */
    public Bug(Display resIn){
        Debug.printToStdout(4, "Bug Constuctor Called.");
        res = (Results) resIn;
    }

    /** MoveRight method to append 1 to result storage container 
     *
     */
    public void moveRight(){
        Debug.printToStdout(3, "Bug moveRight method called.");
        res.addToList(1);
    }

    /** MoveLeft method to append 2 to result storage container 
     *
     */
    public void moveLeft(){
        Debug.printToStdout(3, "Bug moveLeft method called.");
        res.addToList(2);
    }

    /** MoveUp method to append 3 to result storage container 
     *
     */
    public void moveUp(){
        Debug.printToStdout(3, "Bug moveUp method called.");
        res.addToList(3);
    }

    /** MoveDown method to append 4 to result storage container 
     *
     */
    public void moveDown(){
        Debug.printToStdout(3, "Bug moveDown method called.");
        res.addToList(4);
    }

    /** Method used to remove last movement
     *
     */
    public void undoPrev(){
        Debug.printToStdout(3, "Bug undoPrev method called.");
        res.undoLastMove();
    }

    /** toString Method to return Bug string representation 
     *
     *  @return String represention of Bug
     */
    public String toString() {
        Debug.printToStdout(3, "Bug toString method called.");
        String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
        return retValue;
    }

}