package Section3.demos.constructorDemo;

public class StudentTest {
	
public static void main(String[] args) {
		
		Student s1 = new Student(1000, "john","male",18, 123456,3.8, 'B',false );
		s1.compute();
		Student s2 = new Student(1001, "shiv", "male", 23, 111111, 3.5, 'C',true);
		s2.compute();
		Student s3 = new Student(1002, "norman", "female", 93, 13333333, 2.7, 'D', false);
		s3.compute();
	
		s1.updateName("jon");
		System.out.println("student 1's update name: "+s1.name);
		
		//this object reference is pointing to same object in memory
		Student s4 = s1;
		s4.updateName("Mike");
		System.out.println(s1.name); //returns Mike
		
		s4=s2;
		System.out.println(s4.name); //returns shiv
		

	}
}
