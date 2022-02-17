package Section10.Demos.DefaultMethods;

import java.util.ArrayList;
import java.util.List;

public class X extends AbstractA implements A, B{

	@Override
	public void foo() {
		System.out.println("X: foo");
		System.out.println("Val from A: "+A.VAL+ " VAL from B: "+B.VAL);
	}
	
	void foo(ArrayList list) {
		
	}
	void foo(List list) {
		
	}

}
