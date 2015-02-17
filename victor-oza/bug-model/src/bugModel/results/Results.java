
package bugModel.results;

import bugModel.util.Debug;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;



public class Results implements Display, FileLog, StoreMovements{
    private ArrayList<Integer> movements;

    public Results(){
        movements = new ArrayList<Integer>();
        Debug.printToStdout(4, "Results Constuctor Called.");
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
                System.err.println(e.getMessage());
                System.exit(1);
            }
            finally{

            }
        }
    }

    public Writer openFile(String filepath){
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

    public void writeToFile(String filepath){
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

    public void undoLastMove(){
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

    public String toString() {
        String retValue = "\n Results toString \n";
        return retValue;
    }

} // end public class Results


