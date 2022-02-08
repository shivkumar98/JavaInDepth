package Section5.Demos.InformationHiding;

public class Student {
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
	private static int studentCount;
	
	private int id;
	private String name;
	private String gender;
	private int age;
	private long phone;
	private double gpa;
	private char degree;
	
	private boolean international;
	private double tuitionFees = 12000.0;
	private double internationalFees = 5000.0;
	
	// Getters and Setters:	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender == "male" || gender == "female") {
			this.gender = gender;
		} else {
			throw new IllegalArgumentException("Invalid gender");
		}
	}

	Student(){ // no args constructor	
	}
	
	
	
	void updateName(String name) {
		this.name = name;
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

}
