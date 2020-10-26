/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
// 		High-Quality Video Tutorials: www.helloDrDan.com
// 		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// In this lesson you will learn:
//		1) The String datatype and some of the most common String modification/info methods:
//			a) toLowerCase(), toUpperCase(), replace(), length()
//		2) How to parse sub-portions of a String into smaller Strings using the following String methods:
//			a) split(), indexOf(), substring()
// 		3) To use the Scanner to read user input from the console into String variables
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Lesson_03_Strings_And_Parsing {

	///////////////////////////////////////////////////////////////
	// MAIN - Entry point where code will begin execution for file
	///////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// Simple welcome statements printed to screen
		System.out.println("Program Objective: Learn to parse Strings and use basic String methods");
		System.out.println("===========================================================================");

		// A scanner allows us to read in variables/data from the user
		Scanner scan = new Scanner(System.in);


		// Initialize variables for first, middle and last names
          String firstName;
		  String middleName;
          String lastName;
          String wholeName;
		//////////////////////////////////////////////////////////////////////////////
		// Prompt user for first, middle and last name and read in, one at a time
//		System.out.print("Please enter your first, middle and last names: ");
//		firstName = scan.next();
//		middleName = scan.next();
//		lastName = scan.next();

		//System will see spaces or enter between entries and will know it's a separate entry
//		System.out.printf("Your name is %s %s %s\n", firstName, middleName, lastName);
		//////////////////////////////////////////////////////////////////////////////
		// Prompt user for first, middle and last name and read in, all at once (use split)
		System.out.print("Please enter your first, middle and last names: ");
//		firstName = scan.next();
//		middleName = scan.next();
//		lastName = scan.next();
		//System.out.printf("Your name is %s %s %s\n", firstName, middleName, lastName);
		//wholeName = scan.nextLine();
		//system is looking for a line break now
		//firstName = wholeName.split(" ")[0];



		//System.out.printf("Your all at once name is: %s", wholeName);
		//System.out.printf("\nFirst name is: %s", firstName);
		//////////////////////////////////////////////////////////////////////////////
		// Prompt user for first, middle and last name and read in, all at once (use substring)

		
		// Parse first, middle and last names using substring and indexOf methods
		
		// Print out first, middle and last names along with their lengths

	}
}
