package Section3.demos.constructorDemo;

public class Student {
	
	int id;
	int age;
	Student(int newId) {
		id = newId;
	}
	Student(int age, int id){
		if (false) {
			return;
		}
		this.age = 1;
		this.id = 2;
		
	}
	
	public static void main(String[] args) {
		Student s = new Student(18,1);
		System.out.println("age: "+s.age+" id: "+s.id); //age: 1 id: 2

		
	}

}
