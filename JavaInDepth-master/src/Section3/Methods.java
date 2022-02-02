package Section3;

public class Methods {
	static double sum(double x, double y) {
		return x+y;
	}
	static float floatSum(float x, float y) {
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(sum(2, 2.3)); //4.3
		// we can do implicit casting
		// so we can use floats instead of double
		System.out.println(sum(12.2f, 12.3f)); //24.5
		
		//System.out.println(floatSum(1.23f, 1.23d)); however we cant do this due to inability to implicit cast
		//however we can do explicit cast:
		System.out.println(floatSum(1.2f,(float)1.2d));
	}
}
