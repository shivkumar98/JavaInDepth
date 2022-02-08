package Section4.Demos;

import java.util.*;

class FooClass {
	void foo() {
		ArrayList list = new ArrayList();
	}
}

public class Recursion {
	
	static int factorial (int n) {
		if (n == 1 || n==0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
		
	}
	
	static int binarySearch(int[] a, int l, int h, int key) {
		if (l==h) {
			if (key == a[l]) {
				return l;
			} else {
				return -l;
			}
		}
		
		int mid = (l+h)/2;
		
		if (key == a[mid]) {
			return mid;
		} else if (key > a[mid]) {
			return binarySearch(a, mid+1, h, key);
		} else {
			return binarySearch(a, l, mid-1, key);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(3)); // 6
		System.out.println(factorial(0)); // 1
		
		int[] a = {11, 19, 24, 34, 55, 65, 71, 83, 91 };
		int index = binarySearch(a, 0, 8, 91);
		System.out.println(index); //8
		
		index = binarySearch(a, 0, 8, 65);
		System.out.println(index); //5
		
		
	}
	
	

}
