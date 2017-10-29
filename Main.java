/**
* Author: Nelson Victor Cruz Hdez
* Alias: vicco
* Mail: victor.cruz.isc@gmail.com | victor@bitso.com
* Description: Simple C calling method class
* Date: 29/10/2017
*/

public class Main{
	public static void main(String args[]){
		// Wrapper initialization
		JavaCWrapper cwrapper = JavaCWrapper.getInstance();

		cwrapper.aboutFromC();
		double receivedAdditionFromC = cwrapper.additionFromC(9, 10);
		double receivedSubstractionFromC = cwrapper.substractionFromC(9, 10);
		double receivedDivisionFromC = cwrapper.divisionFromC(5, 10);

		// Showing data in console
		System.out.println("a) Java class addition result: " + receivedAdditionFromC);
		System.out.println("b) Java class substraction result: " + receivedSubstractionFromC);
		System.out.println("c) Java class division result: " + receivedDivisionFromC);
	}
}