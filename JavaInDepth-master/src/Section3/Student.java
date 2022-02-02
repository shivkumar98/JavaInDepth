package Section3;

public class Student {
	//variable declarations
	int id;
	String name;
	String gender;
	
	//method definitions
	boolean updateProfile(String newName) {
		this.name = newName;
		return true;
	}
}
