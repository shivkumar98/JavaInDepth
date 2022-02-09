package Section7.Demos.Static;

import java.util.HashMap;

public class StaticExample {
	
	public StaticExample(int id){
		System.out.println("inside constructor with parameter "+id);
	}
	
	//instance initiakliser
	{
		System.out.println("insider instance initialiser");
	}
	
	public static void main(String[] args) {
		StaticExample s = new StaticExample(0);
		// the instance initialiser gets copied to the beginning of the constructor
	}
	
}
