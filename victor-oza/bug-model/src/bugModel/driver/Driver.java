
package bugModel.driver;

import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.bug.AllDirectionsBug;
import bugModel.bug.Bug;

public class Driver{

    public static void main(String args[]) {

        if(args.length < 2) {
            System.err.println("Usage:  FIXME\n");
            System.exit(1);
        }
        
        // AllDirectionsBug b = new Bug();
        Display res = new Results();
        ((Display)res).writeToScreen();

        AllDirectionsBug b = new Bug(res);
        System.out.println(b);
        b.moveRight();
        b.moveLeft();
        b.moveUp();
        b.moveDown();
        res.writeToScreen();

        // All test cases

    } // end main(...)

} // end public class Client

