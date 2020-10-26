/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
//		High-Quality Video Tutorials: www.helloDrDan.com
//		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// Lesson Note:
// 		This class is consumed by Lesson_01_StarWarsUniverseClient_Basic_OOP & Lesson_02_StarWarsUniverseClient_Advanced_OOP.
//		This class encapsulates the Humanoid, which describes basic human properties; it also inherits methods/variables
// 		from the GalacticID class.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Humanoid {

	///////////////////////////////////////////////////////////////
	// Instance variables
	///////////////////////////////////////////////////////////////
	private String name;
	private String homeWorld;
	private String attack;
	private String defense;

	///////////////////////////////////////////////////////////////
	// Default Constructor
	//		Parameters:
	//			NONE
	///////////////////////////////////////////////////////////////
	public Humanoid() {
	    name = "no name";
	    homeWorld = "Earth";
	    attack = "Arm Swing";
	    defense = "Cry";
    }
	///////////////////////////////////////////////////////////////
	// Overloaded Constructor
	//		Parameters:
	//			pName - A String representing the humanoid's name
	//			pHomeWorld - A String representing the humanoid's homeworld
	//			pAttack - A String representing the humanoid's default attack
	//			pDefense - A String representing the humanoid's default defense
	//			pRobot - A Robot that the humanoid owns
	///////////////////////////////////////////////////////////////
    public Humanoid(String pName, String pHomeWorld, String pAttack, String pDefense) {
        name =pName;
        homeWorld = pHomeWorld;
        attack = pAttack;
        defense = pDefense;
    }
	///////////////////////////////////////////////////////////////
	// Getters  This is a public interface to my private info
	///////////////////////////////////////////////////////////////
public String getName() {
		return name;
}

public String getHomeWorld(){
		return homeWorld;
}

public String getAttack() {
		return attack;
}

public String getDefense() {
		return defense;
}
	///////////////////////////////////////////////////////////////
	// Setters This is a public interface to my private info
	///////////////////////////////////////////////////////////////
public void setName(String pName) {
		name = pName;
}
	public void setHomeWorld(String pHomeWorld) {
		homeWorld = pHomeWorld;
	}
	public void setAttack(String pAttack) {
		attack = pAttack;
	}
	public void setDefense(String pDefense) {
		defense = pDefense;
	}
	///////////////////////////////////////////////////////////////
	// Override the toString method (from the object class)
	//		Parameters:
	//			NONE
	//		Returns:
	//			A String representing the object's (Humanoid's) properties
	///////////////////////////////////////////////////////////////

public String toString() {
		String ret = String.format("%s, from %s, has an attack of %s and a defense of %s", name, homeWorld, attack, defense);
		return ret;
}
	
	///////////////////////////////////////////////////////////////
	// Override the equals method (from the object class)
	//		Parameters:
	//			An object to compare with THIS object
	//		Returns:
	//			A boolean that is true if this object's variables
	//			have the same values/properties as Object o
	///////////////////////////////////////////////////////////////
public boolean equals(Object o) {
	if (!( o instanceof Humanoid))
		return false;
	// We have a humanoid, if THIS object has properties that
	  // do NOT match with other humanoid's properties, then NOT EQUAL.
	Humanoid otherHumanoid = (Humanoid) o;
    if (!name.equals(otherHumanoid.name) || !homeWorld.equals(otherHumanoid.homeWorld) || !attack.equals(otherHumanoid.attack) || !defense.equals(otherHumanoid.defense))
    	return false;

    // If we made it this far, then they are equal
    return true;
}
	///////////////////////////////////////////////////////////////
	// This method describes the attack, generates a random outcome
	// and then describes the result (who won).
	//		Parameters:
	//			enemy - A Humanoid instance to fight
	//		Returns:
	//			A String representing a narrative/story of the fight
	///////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////
	// This method provides an implementation for the abstract
	// method it is overriding. It provides an empire id based
	// on the homeworld and galactic id
	//		Parameters:
	//			NONE
	//		Returns:
	//			A String representing a formatted empire id
	///////////////////////////////////////////////////////////////
}