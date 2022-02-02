package Section3;

public class twoDimensionalArrays {
	public static void main(String[] args) {
		int[][] array = new int[2][]; // this array has 2 rows
		
		array[0] = new int[] {1,2,3};
		array[1] = new int[] {4};
		
		System.out.println(array[0][0]); //1 
		System.out.println(array[0][1]); //2
		System.out.println(array[0][2]); //3
		// System.out.println(array[0][3]); - out of bounds
		System.out.println(array[1][0]);
		// System.out.println(array[1][1]); - out of bounds
		
		
	}
}
