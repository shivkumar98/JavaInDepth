package Section3.demos;

public class Varargs {
	static void foo(boolean truth, int... nums){
		if (truth) {
			System.out.println(nums.length);
		} 
	}
	public static void main(String[] args) {
		foo(true); //0
		foo(true,1,2,3,4); //4
		foo(false); //returns nothing
	}

}
