
package bugModel.results;

import java.io.Writer;


public interface FileLog {
    // add appropriate method 
    public void writeToFile(String filepath);
    public Writer openFile(String filepath);

} 
