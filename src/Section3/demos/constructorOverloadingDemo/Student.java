package Section3.demos.constructorOverloadingDemo;


public class Student {
	static int studentCount;
	
	int id;
	String name;
	String gender;
	int age;
	long phone;
	double gpa;
	char degree;
	
	boolean international;
	double tuitionFees = 12000.0;
	double internationalFees = 5000.0;

	
	Student(){ // no args constructor	
	}
	Student( int id, String name, String gender, int age, long phone, double gpa, char degree){
		this(id, name, gender, age, phone,gpa,degree, false);
	}
	Student( int id, String name, String gender, int age, long phone, double gpa, char degree, boolean international){
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.gender = gender;
		this.gpa = gpa;
		this.degree = degree;
		this.international =  international;
	}
	
	
	void compute() {
		studentCount = studentCount + 1;
		if (international) {
			tuitionFees+=internationalFees;
		}
		
		System.out.println("id: " +id);
		System.out.println("name: " +name);
		System.out.println("gender: " +gender);
		System.out.println("age: " +age);
		System.out.println("phone: " +phone);
		System.out.println("gpa: " +gpa);
		System.out.println("degree: " +degree);
		System.out.println("international: " +international);
		System.out.println("tuitionFees: " +tuitionFees);
		System.out.println("studentCount: " +studentCount);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1000, "john","male",18, 123456,3.8, 'B',false );
		s1.compute();
		Student s2 = new Student(1001, "shiv", "male", 23, 111111, 3.5, 'C',true);
		s2.compute();
		Student s3 = new Student(1002, "norman", "female", 93, 13333333, 2.7, 'D', false);
		s3.compute();
		System.out.println(studentCount); //3
		
		//using the no international constructor
		Student s4 = new Student(1003,"Jacob","male",24,111111,2.2,'E');
		s4.compute();

	}

}
