package Section3;

public class PrimitiveVariables {
	int id =1000;
	byte age =18;
	//byte rank = 165;
	// the above will not compile as 165 is not in range of byte
	//int phone = 222222222222222;
	// the above is an invalid literal as the number is not in range of int
	long phone = 2222222222222L;
	
	//boxed primitives:
	int minVal = Integer.MIN_VALUE;
	int maxVal = Integer.MAX_VALUE;
	
	void compute() {
		int nextId = id +1;
		System.out.println(id);
		System.out.println(nextId);
		
	}
	
	public static void main(String[] args) {
		PrimitiveVariables p = new PrimitiveVariables();
		p.compute();
	}

}
