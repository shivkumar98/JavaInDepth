package Section5.Demos.StringPool;

public class stringPool {
	
	static void stringPool() {
		String s1 = "hello!"; 
		String s2 = "hello!";
		String s3 = "hello!".intern(); // like double interning
		String s4 = new String("hello!");
		String s5 = "lo!";
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // true
		System.out.println(s1 == s4); // false
		System.out.println(s1 == s4.intern()); // true
		
		System.out.println(s1 == "hel"+"lo!"); // true
		
		System.out.println(s1 == "hel"+s5); //false
		
		final String s6 = "lo!";
		System.out.println(s1 == "hel"+s6); // true
		
	}
	public static void main(String[] args) {
		stringPool();
	}

}
