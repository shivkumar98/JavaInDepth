package Section4.Demos;

public class LabeledBreak {

	static void labeledBreak() {
		System.out.println("\n Labeled break");
		
		int num = 0;
		
		for (int i =0; i<10;i++ ) {
			for (int j =0; j<10; j++) {
				if (i==5 & j ==5) {
					break;
				}
				num++;
			}
		}
		System.out.println(num); // 95
		
		num=0;
		outermost: for (int i =0; i<10; i++) {
			for (int j =0; j<10; j++) {
				if (i==5 & j ==5) {
					break outermost;
				}
				num++;
			}
		}
		System.out.println(num); //55
		
		
	}
	
	public static void main(String[] args) {
		labeledBreak(); //result 55
	}
	
}
