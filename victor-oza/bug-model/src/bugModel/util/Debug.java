
package bugModel.util;

public class Debug {
	private static int debugValue;

	public static void setDebugValue(int indebugValue) {
		debugValue = indebugValue;
	}

	public static void printToStdout(int level, String debugMessage){
		if(level == debugValue){
			System.out.println(debugMessage);
		}
	}
}