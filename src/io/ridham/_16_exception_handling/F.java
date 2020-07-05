package io.ridham._16_exception_handling;

// With try-catch you can also have finally block

/* try without catch or finally is invalid
 * catch or finally without try is invalid
 * nesting is possible in try-catch-finally
 * try-catch-finally pair used must be within block
 * relative blocks of pair must be used back to back without interruption
 * 
 * it must be :
 * 	try-catch
 * 	try-finally
 * 	try-catch-finally 
 * */
public class F {
	public static void main(String[] args) {
		try{
			int arr[] = {1,2,3};
			int i = arr[3];
		}
		catch(Exception e) {
			int i = 0;
		}
		// finally block used for cleanup activity of resource used in try block
		// It executes even if exception raised or note, exception handled or not
		finally	{
			System.out.println("This is finally block.");
		}
	}
}

// 'finally' is method used by JVM when destroying objects
// It will perform cleanup activities of resources used by that object
