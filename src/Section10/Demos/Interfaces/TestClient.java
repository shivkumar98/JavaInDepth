package Section10.Demos.Interfaces;

public class TestClient {
	
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		X x = new X();
		x.foo(); // X: foo
		x.bar(); // AbstractA: bar

	}
}
