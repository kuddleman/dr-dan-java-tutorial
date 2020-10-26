import java.util.ArrayList;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
// 		High-Quality Video Tutorials: www.helloDrDan.com
// 		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// In this lesson you will learn:
//		1) Basic object-oriented functionality
//			a) Class creation from scratch
//				i) Instance variables
//					a) Primitive data types
//					b) Object (custom class) data types
//				ii) Access modifiers
//				iii) Constructors (default, overloaded)
//				iv) Getters/Setters
//				v) Overriding methods
//					a) toString() method
//					b) equals() method
//				vi) Custom/Class methods
//			b) Class creation using from Eclipse helpers
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Lesson_01_StarWarsUniverseClient_Basic_OOP {

	///////////////////////////////////////////////////////////////
	// MAIN - Entry point where code will begin execution for file
	///////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// Simple welcome statements printed to screen
		System.out.println("Program Objective: Learn basic object oriented programming concepts.");
		System.out.println("===========================================================================");
		
		// Create a number of humanoids
		Humanoid luca = new Humanoid("Luca Skyscraper", "Tatooine", "Rock-paper", "Force Projection");
		Humanoid babyYoda = new Humanoid("Baby Yoda", "Dagobah", "Force Choke", "Cuteness");
		Humanoid  mace = new Humanoid("Mace Windu", "Xi", "Purple Saber Slash", "Run!");
		Humanoid konobe = new Humanoid("Konobe Bryant", "Lala Land", "Slam Dunk Yo' Head", "Smack down block");


		// Create a new robot and add it to 
		
		// Add each person to an ArrayList to be processed
		ArrayList<Humanoid> empireDMV = new ArrayList<Humanoid>();
		empireDMV.add(luca);
		empireDMV.add(babyYoda);
		empireDMV.add(mace);
		empireDMV.add(konobe);

		// Processes everyone in the empire DMV line
		for ( int i = 0; i < empireDMV.size(); i++) {
			Humanoid unhappyCustomer = empireDMV.get(i);
			processDmvCustomer(unhappyCustomer, i + 1);
			System.out.println("\n" + unhappyCustomer);
		}
		
		// Pick two random customers from the line
			
		// Customers are so unhappy with their DMV experience, they get into a fight
	}



	///////////////////////////////////////////////////////////////
	// This method describes an interaction between the DMV and the
	// humanoid passed into the method. All interactions are printed
	// to the console.
	//		Parameters:
	//			h - A Humanoid to be processed
	//			placeInLine - The humanoid's (h's) place in line 
	//		Returns:
	//			void (nothing)
	///////////////////////////////////////////////////////////////

	private static void processDmvCustomer(Humanoid unhappyCustomer, int i) {

	}
}
