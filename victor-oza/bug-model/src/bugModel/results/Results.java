
package bugModel.results;

import java.util.ArrayList;

public class Results implements Display, FileLog {
    private ArrayList movements;

    public Results(){
        movements = new ArrayList();
    }

    public void addToList(int movement){
        movements.add(movement);
    }

    public void writeToScreen(){
        for (int i = 0; i < movements.size(); i++){
            System.out.print(movements.get(i));
        }
    }

    public void writeToFile(){
        
    }

    public String toString() {
        String retValue = "\n Results toString \n";
        return retValue;
    }

} // end public class Results


