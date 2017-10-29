/**
* Author: Nelson Victor Cruz Hdez
* Alias: vicco
* Mail: victor.cruz.isc@gmail.com | victor@bitso.com
* Description: Simple C calling method class
* Date: 29/10/2017
*/

public class JavaCWrapper{
	private static final String C_LIB_NAME = "nvch";
	private static JavaCWrapper mJavaCWrapper;

	static {
		System.loadLibrary(C_LIB_NAME);
	}

	// C wrapper methods with JNI (Java Native Interface)
	public native double additionFromC(double a, double b);
	public native double substractionFromC(double a, double b);
	public native double divisionFromC(double a, double b);
	public native void aboutFromC();

	/**
	* Private constructor for singleton design pattern
	*/
	private JavaCWrapper(){}

	/**
	* Singleton implementation
	*/
	public static JavaCWrapper getInstance(){
		if(mJavaCWrapper == null){
			mJavaCWrapper = new JavaCWrapper();
		}
		return mJavaCWrapper;
	}
}