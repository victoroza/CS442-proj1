
package bugModel.results;

import java.io.Writer;

/** FileLog interface which will be extended by the Results class.
 *  Used to open and store movements to file.
 *	
 * @author Victor Oza
 */
public interface FileLog {
	/** Used to write values in data structure to file specified.
     *
     */
    public void writeToFile(String filepath);
    /** Used to open file and create fileWriter instance.
     *
     *  @param filepath     String of filepath to write log to
     *  @return             FileWriter instance pointing to filepath
     */
    public Writer openFile(String filepath);

} 
