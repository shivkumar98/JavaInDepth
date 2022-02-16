package Section7.Demos.AccessModifiers.package2;
import Section7.Demos.AccessModifiers.pacakge1.A1;

public class RegularClassPackage2 {
	public static void main(String[] args) {
		System.out.println(A1.publicInt);
		// System.out.println(A1.protectedInt); // not accessible since not in same package NOR not a subclass
		// System.out.println(A1.defaultInt); // not accessible since not in same package
		// System.out.println(A1.prvateInt); // not accessible since not in same class
		
	}

}
