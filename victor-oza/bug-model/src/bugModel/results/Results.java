
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
            try{
                System.out.print(movements.get(i));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.exit(1);
            }
            finally{

            }
        }
    }

    public void writeToFile(){
        
    }

    public void undoLastMove(){
        if(movements.size() > 0){
            try{
                movements.remove((movements.size() - 1));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.exit(1);
            }
            finally{
                
            }
        }
        else{
            addToList(0);
        }
    }

    public String toString() {
        String retValue = "\n Results toString \n";
        return retValue;
    }

} // end public class Results


