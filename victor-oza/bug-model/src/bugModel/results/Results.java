
package bugModel.results;

import java.util.ArrayList;

public class Results implements Display, FileLog {
    private ArrayList<int> movements;

    public Results(){
        movements = new ArrayList<int>();
    }

    public void writeToScreen(){
        
    }

    public void writeToFile(){
        
    }

    public String toString() {
        String retValue = "\n Results toString \n";
        return retValue;
    }

} // end public class Results


