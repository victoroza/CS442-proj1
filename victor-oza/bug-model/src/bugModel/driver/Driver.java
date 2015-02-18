
package bugModel.driver;

import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.results.FileLog;
import bugModel.bug.AllDirectionsBug;
import bugModel.bug.Bug;
import bugModel.util.Debug;

/** Driver Class which will test the classes
 *
 * @author Victor Oza
 */
public class Driver{

    public static void main(String args[]) {

        if(args.length < 2) {
            System.err.println("Usage:  Please provide 3 arguments as needed by the program.\n");
            System.exit(1);
        }
        int debugValue = -1;
        try{
            debugValue = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
        finally{
            if(debugValue < 0){
                System.exit(1);
            }
        }
        Debug.setDebugValue(debugValue);
        // AllDirectionsBug b = new Bug();
        Display res = new Results();
        ((Display)res).writeToScreen();

        AllDirectionsBug b = new Bug(res);
        b.undoPrev();
        System.out.println(b);
        b.moveRight();
        b.moveLeft();
        b.moveUp();
        b.moveDown();
        res.writeToScreen();
        System.out.println();
        b.moveUp();
        b.moveUp();
        b.moveUp();
        b.undoPrev();
        res.writeToScreen();
        ((FileLog)res).writeToFile(args[2]);

        // All test cases

    } // end main(...)

} // end public class Client

