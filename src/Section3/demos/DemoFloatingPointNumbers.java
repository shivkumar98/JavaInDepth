package Section3.demos;

public class DemoFloatingPointNumbers {
	// float gpa = 3.8; - this is not valid as the literal is interpreted as a double bly default
	float gpa = 3.8f;
	double height = 11.1; // we can also write the literal as 11.1d
	
	//scientific notation
	double largeNumber = 3.8E10;
	
	//large precision
	double largePrecision = 3.88888833354354449469162;
	float lowPrecision = 3.88888833354354449469162f;
	
	public static void main(String[] args) {
		DemoFloatingPointNumbers d = new DemoFloatingPointNumbers();
		System.out.println(d.largeNumber); //3.8E10
		System.out.println(d.largePrecision); //3.8888883335435445 - truncation has occured
		System.out.println(d.lowPrecision); //3.8888884 - floats have less precision

	}

}
