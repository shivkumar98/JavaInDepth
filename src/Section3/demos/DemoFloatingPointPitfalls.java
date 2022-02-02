package Section3.demos;

import java.math.BigDecimal;

public class DemoFloatingPointPitfalls {
	
	public static void main(String[] args) {
		System.out.println(1-0.9); // 0.09999999999999998
		System.out.println(1-0.7); // 0.30000000000000004
		// these issues are a result of how real numbers are represented in binary
		// we can not exactly represent 0.1 ibn binary

		// when working with money, you should not use float/decimal
		// we can use BigDecimal to help represent numbers exactly
		
		BigDecimal first = new BigDecimal("0.1");
		BigDecimal second = new BigDecimal("0.2");
		
		System.out.println(first.add(second)); // 0.3
				
	}

}
