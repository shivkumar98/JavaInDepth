package Section7.Demos.AccessModifiers.package2;
import Section7.Demos.AccessModifiers.pacakge1.A1;

public class C2ExtendsA1 extends A1 {
	public static void main(String[] args) {
		System.out.println(A1.protectedInt);
		System.out.println(A1.publicInt);
		// System.out.println(A1.defaultInt); // not accessible due 
										   // to not being in the same package
		// System.out.println(A1.privateInt); // not accessible due
										   // to not being in the same class
	}
}
