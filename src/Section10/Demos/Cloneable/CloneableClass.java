package Section10.Demos.Cloneable;

public class CloneableClass implements Cloneable{
	
	public CloneableClass clone() {
		try {
			return (CloneableClass) super.clone();
		} catch(CloneNotSupportedException e) {}
		
		return null;
	}
	
	public static void main(String[] args) {
		CloneableClass c = new CloneableClass();
		c.clone();
	}
}
