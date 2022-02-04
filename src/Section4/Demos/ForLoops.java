package Section4.Demos;

import java.util.Arrays;

import javax.xml.transform.Templates;

public class ForLoops {
	public static void main(String[] args) {
		int[] myArray = { 0,1,2,3,4,5,6,7,8};
		for (int i =0; i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		
		
		for (int i =0, j =myArray.length-1; i<myArray.length && j>=0;i++,j--) {
			System.out.println("i: "+i+" j: "+j+" i+j: "+(i+j)); // 8 8 8 8 8 8 8
		}
		
		//incrementing by different amount
		for (int i=0; i < myArray.length; i+=2) {
			System.out.println(myArray[i]); // 0 2 4 6 8
		}
		
		System.out.println("--------------------------");
		
		for (int i=myArray.length-1; i>=0; i--) {
			System.out.println(myArray[i]); // 8 7 6 5 4 3 2 1 0
		}
		System.out.println("--------------------------");
		
		// reversing position
		// odd number of elements:
		// myArray = new int[] {1,2,3,4,5}; -- works as expected
		// even number of elements
		myArray = new int[] {1,2,3,4,5,6};
		for (int i=0,j=myArray.length-1; i<myArray.length/2; i++,j--) {
			int temp = myArray[i];
			myArray[i] = myArray[j];
			myArray[j] = temp;
		}
		Arrays.stream(myArray).forEach(x -> System.out.println(x));
		
		System.out.println("---------------------------");
		
		// we can optimise the for loop by computing the midpoint only once:
		myArray = new int[] {1,2,3,4,5,6};
		for (int i=0,j=myArray.length-1, midpoint = myArray.length/2; i<midpoint; i++,j--) {
			int temp = myArray[i];
			myArray[i] = myArray[j];
			myArray[j] = temp;
		}
		Arrays.stream(myArray).forEach(x-> System.out.println(x)); // 6 5 4 3 2 1
		
		System.out.println("---------------------------");
		
		// Counting divisors
		int x = 24;
		int divisorCount=0;
		for (int i = 1; i<x+25; i++) {
			if (x % i == 0) {
				System.out.println("divisor: "+i);
				divisorCount++;
			}
		}
		System.out.println(divisorCount); // 8
		
		System.out.println("-------------------------");
		
		// Nested for-loops
		int[][] studentGrades = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		System.out.println(studentGrades.length); // 3 rows
		for (int i=0; i<studentGrades.length;i++) {
				System.out.println("Grades of row "+i);
			for (int j = 0; j< studentGrades[i].length; j++) {
				System.out.print(studentGrades[i][j] + " ");
			}
			
		}
		/* Grades of row 0
		1 2 3 4 5
		Grades of row 1
		6 7 8 9 10
		Grades of row 2
		11 12 13 14 15
		*/ 
		
	}
}
