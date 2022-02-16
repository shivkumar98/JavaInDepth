package Section9.Demos.Abstract;

public class ConcreteSubClass extends AbstractClass {

	@Override
	public void abstractMethod() {
		System.out.println("Calling from abstract method");
	}

	@Override
	String abstractMethod2() {
		return "Calling from abstract method 2";
	}
	
	public static void main(String[] args) {
		ConcreteSubClass c = new ConcreteSubClass();
		c.abstractMethod(); // Calling from abstract method
		System.out.println(c.abstractMethod2()); // Calling from abstract method 2
		// AbstractClass ab = new AbstractClass(); you can NOT instantiate abstract classes
	}

}
