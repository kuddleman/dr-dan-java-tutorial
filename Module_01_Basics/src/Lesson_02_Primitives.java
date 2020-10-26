/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
// 		High-Quality Video Tutorials: www.helloDrDan.com
// 		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// In this lesson you will learn:
// 		1) The primitive data types, how to set literal values and their ranges
//			a) Whole numbers: byte, short, int, long
//			b) Decimal-point numbers: float, double
//			c) Misc.: boolean, char
// 		2) Best practices for when to use certain primitive data types
//			a) You should almost always use int for whole numbers (unless keeping track of a unique ID, then use long)
//			b) You should almost always use double for decimal-point numbers
//		3) To further master System.out.printf() by:
//			a) Formatting decimal numbers with a certain number of digits after the decimal point
//			b) Formatting numbers with thousands separators
//			c) Formatting numbers to scientific notation
//		4) To use the Scanner to read user input from the console into variables of any of the primitive data types
//		5) The binary number system and how numbers are mapped to 0's and 1's
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Lesson_02_Primitives {

	///////////////////////////////////////////////////////////////
	// MAIN - Entry point where code will begin execution for file
	///////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// Simple welcome statements printed to screen
		System.out.println("Program Objective: Learn primitive data types, printf() mastery, scanner input.");
		System.out.println("===========================================================================");
		System.out.println();
		
		////////////////////////////////////////////////////////
		// Primitive Literals (40,000 foot view) 
		////////////////////////////////////////////////////////

		// 3 different types of primitives

		// Whole Number Primitives
		// bit is either 0 or 1
		// a BYTE is 8 BITS

		 byte myByte; // -128 to 127
		 short myShort; // ~ -32K to +32K
		 int myInt;  // ~ - 2bill to + 2bill
		 long myLong; // ~ -9 quint to +9 quint
		// must use 'L'  for longs
		 myLong = 9000000000000000000L;

		// Decimal Point Primitives
		  float myFloat = 3.14F;
		  // must use 'f' with float;
		  double myDouble;

		// Other Primitives
		  boolean myBoolean = true;
		  char myChar = 'g';

		// Print All Primitive Data Types
		
		// Initialize Scanner to read in from user
		Scanner scan = new Scanner(System.in);
		// A scanner allows us to read in variables/data from the user
		
		////////////////////////////////////////////////////////
		// Primitive whole number data types
		////////////////////////////////////////////////////////
		// Print basic BYTE info
		/*
		the BYTE datatype uses 1-byte consisting of 8 bits to represent negative
		numbers from -128 to -1  and non-negative numbers from 0 to 127.
		Thus, a BYTE can represent 256 distinct values (2^8 = 256)
		*/

		int numBits = 8;
		int numBytes = 1;
		//System.out.printf("The BYTE datatype uses %s-byte(s)", numBytes);
		byte bMin = Byte.MIN_VALUE;
		byte bMax = Byte.MAX_VALUE;		// Prompt user for input, read input and print

		//System.out.printf("The BYTE datatype represents numbers from %s to %s", bMin, bMax);
		// Prompt user for input, read input and print
		//System.out.printf("enter a whole number within the range %s to %s: ", bMin, bMax);
       // byte b = scan.nextByte();
		//System.out.printf("You typed in: %s", b);
		//double secondDouble = 123.23;
		//System.out.printf("\nThis is my double: %.0f", secondDouble);
		// Print basic SHORT info
		short sMin = Short.MIN_VALUE;
		short sMax = Short.MAX_VALUE;
		int numBitsForShort = 16;
		int numBytesForShort = 2;

//		System.out.printf("MIN short is: %,d  MAX short is: %,d", sMin, sMax);
//		System.out.printf("\nThe BYTE uses %s bits or %s bytes.", numBitsForShort, numBytesForShort);



		// Prompt user for input, read input and print
//		System.out.printf("\nType in a number between %,d and %,d: ", sMin, sMax);
//		short s = scan.nextShort();
//		System.out.printf("You just typed in: %,d", s);
		
		// Print basic INT info
		// Prompt user for input, read input and print

        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;
        int numBitsForInteger = 32;
        int numBytesForInteger = 4;
		
		// Print basic LONG info
		// Prompt user for input, read input and print

		long lMin = Long.MIN_VALUE;
		long lMax = Long.MAX_VALUE;

		int numBitsForLong = 64;
		int numBytesForLong = 8;

//		System.out.printf("The min for long is: %,d", lMin);
		//System.out.printf("\nThe max for long is: %,d", lMax);



		
		////////////////////////////////////////////////////////
		// Primitive decimal-point number data types
		////////////////////////////////////////////////////////
		// Print basic FLOAT info
		// Prompt user for input, read input and print
		float fMin = Float.MIN_VALUE;
		float fMax = Float.MAX_VALUE;

		numBits = 32;
		numBytes = 4;
		// Print basic DOUBLE info
		// Prompt user for input, read input and print

		
		////////////////////////////////////////////////////////
		// Primitive data types (boolean, char)
		////////////////////////////////////////////////////////
		// Print basic BOOLEAN info
		// Prompt user for input, read input and print
		
		// Print basic CHAR info
		// Prompt user for input, read input and print
	}
}
