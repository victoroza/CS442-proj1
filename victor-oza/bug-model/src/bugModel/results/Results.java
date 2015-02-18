
package bugModel.results;

import bugModel.util.Debug;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


/** Results Class which will handle storage of movement
 *
 * @author Victor Oza
 */
public class Results implements Display, FileLog, StoreMovements{
    private ArrayList<Integer> movements;

    /** Default Results constructor
     *  Instantiates movements ArrayList
     *
     */
    public Results(){
        movements = new ArrayList<Integer>();
        Debug.printToStdout(4, "Results Constuctor Called.");
    }

    /** Used to add value to Results data structure.
     *
     *  @param movement value to append to data structure
     */
    public void addToList(int movement){
        Debug.printToStdout(3, "Results addToList method called.");
        Debug.printToStdout(2,  "Item, " + movement + ", was added to Results.");
        try{
            boolean addedValue = movements.add(movement);
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
        catch (NullPointerException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
        finally{

        }
    }

    /** Used to print values in data structure out to stdout.
     *
     */
    public void writeToScreen(){
        Debug.printToStdout(3, "Results writeToScreen method called.");
        for (int i = 0; i < movements.size(); i++){
            try{
                System.out.print(movements.get(i));
            }
            catch (IndexOutOfBoundsException e){
                System.err.println(e.getMessage());
                System.exit(1);
            }
            finally{

            }
        }
    }

    /** Used to open file and create fileWriter instance.
     *
     *  @param filepath     String of filepath to write log to
     *  @return             FileWriter instance pointing to filepath
     */
    public Writer openFile(String filepath){
        Debug.printToStdout(3, "Results openFile method called.");
        File file = new File(filepath);
        Writer fileWriter = null;
        try{
            fileWriter = new FileWriter(file);
        }
        catch (IOException e) {
            System.err.println("Caught IOException: " +  e.getMessage());
            System.exit(1);
        }
        finally {

        }
        return fileWriter;
    }

    /** Used to write values in data structure to file specified.
     *
     */
    public void writeToFile(String filepath){
        Debug.printToStdout(3, "Results writeToFile method called.");
        Writer fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = openFile(filepath);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < movements.size(); i++){
                Object temp = movements.get(i);
                bufferedWriter.write(temp.toString());
            }
        }
        catch (IOException e) {
            System.err.println("Caught IOException: " +  e.getMessage());
            System.exit(1);
        }
        catch (IndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
        finally{
            if (bufferedWriter != null && fileWriter != null) {
                try {
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e) {
                    System.err.println("Caught IOException: " +  e.getMessage());
                    System.exit(1);
                }
            }
        }
    }

    /** Used to remove last value from data structure.
     *  If no value to remove, a 0 should be appended.
     *
     */
    public void undoLastMove(){
        Debug.printToStdout(3, "Results undoLastMove method called.");
        if(movements.size() > 0){
            try{
                movements.remove((movements.size() - 1));
            }
            catch (IndexOutOfBoundsException e){
                System.err.println(e.getMessage());
                System.exit(1);
            }
            finally{

            }
        }
        else{
            addToList(0);
        }
    }

    /** toString value for Results class
     *
     *  @return     String representation of Results Class
     */
    public String toString() {
        Debug.printToStdout(3, "Results toString method called.");
        String retValue = "\n Results toString \n";
        return retValue;
    }

} // end public class Results


