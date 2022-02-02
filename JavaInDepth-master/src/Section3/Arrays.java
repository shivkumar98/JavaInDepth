package Section3;

public class Arrays {
	
	static void arrays() {
		System.out.println("Inside arrays");
		int[] firstArray = new int[3];
		// we cannot have int[] firstArray = new int[]; - the size must be declared
		firstArray[0] = 123;
		firstArray[1] = 234;
		firstArray[2] = 345;
		
		//another way of creating array;
		int[] scores = {1,2,3}; // scores is an object reference
		//scores = {2,4,5}; - we CAN NOT reinitialise an array this way
		scores = new int[] {2,3,4}; // this is valid
		System.out.println("scores: "+scores[0]+ " "+scores[1]+ " "+scores[2]);
		System.out.println("Printing array:");
		System.out.println("1: "+firstArray[0]);
		System.out.println("2: "+firstArray[1]);
		System.out.println("3: "+firstArray[2]);
		
	}
	public static void main(String[] args) {
		Arrays array = new Arrays();
		array.arrays();
		int[] myArray = {1,2,3,4,5,6};
		System.out.println(myArray.length); //6 as expected
		
		// we can have arrays with type of a class:
		Student[] students = new Student[3];
		System.out.println(students[0]); // null
		students[0] = new Student();
		students[1] = new Student();
		System.out.println(students[0]); //Section3.Student@6504e3b2
		students[0].name = "Johnny";
		students[1].name = "Joey";

		System.out.println(students[0].name); // Johnny
		
	}
}
