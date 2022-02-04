package Section4.Demos.ComparisonOperators;

class Student {
    // variable declarations
    int id; 
    String name; 
    String gender = "male";
	
    // Constructors
    Student(int id, String name) {
        this(name); // Invoking overloaded constructor. If present, should be first statement
	this.id = id;
    }
	
    Student(String name) {
	this.name = name;
    }
	
    // method definitions
    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
    
    public static void main(String[] args) {
    	//Comparison operators are used to comapre two operands
    	//relational operators
		int age = 25;
		System.out.println("(age > 21): "+(age > 21)); //true
		System.out.println("(age >= 21): "+(age >= 21)); //true
		System.out.println("(age < 21): "+(age < 21)); //false
		System.out.println("(age == 21): "+(age == 21)); //false
		System.out.println("(age != 21): "+(age != 21)); //true
		
		// >, >= etc are only valid for numeric operands
		
		// System.out.println("a">1); -- invalid
		//System.out.println(true >= 1); -- invalid
		
		//object comparison
		Student s1 = new Student("Shiv");
		Student s2 = new Student("Shiv");
		
		System.out.println("s1==s2: "+(s1 == s2)); //false
		s1 = s2;
		System.out.println("s1==s2: "+(s1==s2)); //true
		
		
	}
}