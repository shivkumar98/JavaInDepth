package Section4.Demos.LogicalOperators;

public class Main {
	
	public static void main(String[] args) {
		int age =37;
		int salary = 95000;
		boolean hasBadCredidt = false;
		
		if (!(age <=35) && salary > 90000 && !hasBadCredidt) {
			System.out.println("approved");
		} else {
			System.out.println("denied");
		} // result: approved
		
		System.out.println(false && false || true); 
		//result:  true -- the above is evaluated as (false and true) || true
		
	}

}
