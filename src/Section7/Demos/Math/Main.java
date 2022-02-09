package Section7.Demos.Math;

public class Main {

	private static void mathDemo() {
		// Lottery [1,100]
		int x = (int) (Math.random()*100)+ 1; // [1,100]
		System.out.println(x);
		
		System.out.println( Math.round(1.2f) ); //1
		System.out.println( (long) Math.round(21.4)); //21
		
		System.out.println( Math.ceil(24.0000001)); // 25.0
		System.out.println(Math.floor(20.9999999999999)); //20.0
	}
	
	public static void main(String[] args) {
		mathDemo();
	}
}
