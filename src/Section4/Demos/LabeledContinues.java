package Section4.Demos;

public class LabeledContinues {
	
	static void labeledContinue() {
		
		
		System.out.println();
		int num = 0;
		
		outermost: for (int i =0; i<10; i++) {
			for (int j =0; j<10; j++) {
				if (i == 5 && j == 5) {
					continue outermost;
				}
				num++;
			}
		}
		System.out.println(num); //95
		
	}
	
	public static void main(String[] args) {
		labeledContinue();
	}

}
