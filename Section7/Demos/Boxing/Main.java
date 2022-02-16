package Section7.Demos.Boxing;

import java.util.ArrayList;

public class Main {
	
	private static void boxedPrimitives() {
		Integer boxedInt = Integer.valueOf(9); // static Factory
		System.out.println(boxedInt); // 9
		
		Boolean boxedBoolean = Boolean.TRUE;
		System.out.println(boxedBoolean); // true
		
		Character c = Character.valueOf('C');
		System.out.println(c); // C
		
		Double d = Double.valueOf(23.9);
		
		// overloads
		Integer integer = Integer.valueOf("8");
		System.out.println(integer); // 8
		
		// the character class does NOT have this overloaded method
		
		//invalid
		// Integer invalid = Integer.valueOf("eight"); // this causes run time error
		
		// NOTE: the string overloaded method is DEPRECATED, its better to just use the number overload
		
		// Unboxing the wrapper classes:
		
		int primitiveInt = boxedInt.intValue();
		boolean primitiveBool = boxedBoolean.booleanValue();
		char primitiveC = c.charValue();
		
		
	}
	
	public static void main(String[] args) {
		boxedPrimitives();
		
		int x = Integer.parseInt("11");
		System.out.println(x); // 11
		
		// autoboxing
		Integer boxedInt = 23;
		Integer boxedInt1 = new Integer(21);
		
		// auto unboxing
		int unboxedInt = boxedInt;
		int unbocedInt1 = boxedInt.intValue();
		
		// invocation
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(32)); // this is unneccesary
		list.add(24); // perfectly valid
		
		
	}
	
}
