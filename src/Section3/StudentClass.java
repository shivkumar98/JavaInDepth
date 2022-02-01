package Section3;
	
public class StudentClass {
	int id;
	int nextId = id+1;
	
	void compute() {
		id=1000; // assignment statements CAN appear in methods but not at class level
		System.out.println("id: "+id);
		System.out.println("nextid: "+nextId);
	}
	public static void main(String[] args) {
		StudentClass student= new StudentClass();
		student.compute(); // 1000 //1
		
	}

}
