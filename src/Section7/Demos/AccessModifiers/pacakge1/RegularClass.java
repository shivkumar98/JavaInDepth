package Section7.Demos.AccessModifiers.pacakge1;

public class RegularClass {
	public static void main(String[] args) {
		System.out.println(A1.defaultInt);
		System.out.println(A1.protectedInt);
		System.out.println(A1.publicInt);
		// System.out.println(A1.privateInt); // this is not visible
	}
}
