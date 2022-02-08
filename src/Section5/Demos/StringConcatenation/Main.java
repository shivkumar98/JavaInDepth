package Section5.Demos.StringConcatenation;

public class Main {
	

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");
		sb.append("world");
		String s = sb.append(" Good").append(" Morning").toString();
		System.out.println(s); // hello world Good Morning
		
		System.out.println("---------------");
		
		String str = "Hello "+"World!";
		StringBuffer strB = new StringBuffer(str);
		
		strB.append(" morning :)");
		System.out.println(strB.toString()); // Hello World! morning :)
		System.out.println(strB.length()); // 23
		strB.delete(1, 5);
		System.out.println(strB.toString()); // H World! morning :)
		strB.insert(1, "ey");
		System.out.println(strB.toString()); //Hey World! morning :)

		

	}
	
}
