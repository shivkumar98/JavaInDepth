package Section4.Demos;

public class ForEach {
	
	public static void main(String[] args) {
		 int[] myArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		 
		 // standard way of printing an array
		 for (int i =0; i<myArray.length;i++) {
			 System.out.println(i);
		 }
		 
		 System.out.println("------------");
		 
		 // using forEach
		 for ( int i : myArray) {
			 System.out.println(i);
		 } // prints: 0 1 2 3 4 5 6 7 8 9
		 
		 System.out.println("-------------");
		 
		 int[] dice1 = {1,2,3,4,5,6};
		 int[] dice2 = {1,2,3,4,5,6};
		 
		 for (int i : dice1) {
			 for (int j : dice2) {
				 System.out.println(i+ " " + j);
			 }
		 }
		 
	}

}
