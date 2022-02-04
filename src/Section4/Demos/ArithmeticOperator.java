package Section4.Demos;

public class ArithmeticOperator {
	
	static void preAndPost() {
		int x = 5;
		++x;
		System.out.println(x); //6
		x--;
		System.out.println(x); //5
		
		int y = x++;
		System.out.println(x); //6
		System.out.println(y); //5
		
		int z = ++x;
		System.out.println(x); //7
		System.out.println(z); //7
		
		
	}
	
	public static void main(String[] args) {
		
	}

}
