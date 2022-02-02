package Section3.demos;

public class DemoVariableKinds {
	
	static int computeCount;
	String var1, var2= "hello", var3;
	String name; // these un initalised variables would get default values
	String Gender;
	int id;
	int age;
	boolean international;
	double tutitionFees= 12000.0;
	double internationalFees = 500.0;
	
	void compute() {
		computeCount++;
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("Gender: "+Gender);
		System.out.println("id: "+id);
		System.out.println("age:: "+age);
		System.out.println("international?: "+international);
		System.out.println("computeCount: "+computeCount);
	}
	
	public static void main(String[] args) {
		DemoVariableKinds student = new DemoVariableKinds();
		student.id=11;
		student.name="Shiv";
		student.name = "john";
		student.age=17;
		student.international=false;
		student.compute(); //1
		student.compute(); //2
		DemoVariableKinds student2 = new DemoVariableKinds();
		System.out.println(student2.computeCount); //2
		// we would typically access this static variables by calling the class:
		System.out.println(DemoVariableKinds.computeCount); //2
	}
	
	

}
