
package bugModel.util;

/** Debug Class which will handle debug output
 *
 * @author Victor Oza
 */
public class Debug {
	private static int debugValue;

	/** Used to set debugValue at runtime 
     *
     *	@param indebugValue	Value that the debugValue will be set to,
     *						values from [0-4] are allowed.
     */
	public static void setDebugValue(int indebugValue) {
		debugValue = indebugValue;
		if(debugValue > 4 || debugValue < 0){
			System.err.println("Debug Value should be [0-4]");
			System.exit(1);
		}
	}

	/** Used to check if debug statement should be printed. 
     *
     *	@param level		Value of input debug statement that,
     *						needs to be checked.
     *	@param debugMessage	String to be printed.
     */
	public static void printToStdout(int level, String debugMessage){
		if(level == debugValue){
			System.out.println(debugMessage);
		}
	}
}