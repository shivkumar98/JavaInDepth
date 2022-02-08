package Section5.Demos.Strings;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s.length());
		System.out.println( new String(""));
		System.out.println(new String(" ").isEmpty()); //false
		System.out.println(s.equals("HeLLo World")); //false
		System.out.println(s.equalsIgnoreCase("heLLo WoRlD")); //true
		System.out.println(s.compareTo("HELLO WORLD")); //32
		System.out.println(s.compareTo("Hello World")); //0
		
		System.out.println("------------");
		
		System.out.println(s.indexOf("ello")); // 1
		System.out.println(s.endsWith("d")); // true
		System.out.println(s.endsWith("ld")); // true
		System.out.println(s.indexOf("o")); // 4
		System.out.println(s.lastIndexOf("o")); // 7
		
		System.out.println("-----------------");
		System.out.println(s.substring(0)); // Hello World
		System.out.println(s.substring(2)); // llo World
		System.out.println(s.substring(0,5)); // Hello
		
		System.out.println("-------------------");
		
		System.out.println(s.toCharArray()[1]); // e
		
		System.out.println("--------------------");
		
		System.out.println(s.toLowerCase()); // HELLO WORLD
		System.out.println(s.toUpperCase()); // hello world
		System.out.println(s); // Hello World - strings are immutable
		
		System.out.println("---------------");
		
		System.out.println(s.replace('l', 'x')); // Hexxo Worxd
		
		System.out.println(s.split("o")); // [Ljava.lang.String;@6504e3b2
		Arrays.stream(s.split("o")).forEach(System.out::println); // [Hell, w, rld]
		
		System.out.println("-----------------");
		
		
	} 

}
