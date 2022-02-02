package Section3.Assignments.Assignment3;

public class MoneyTransferService {
	CurrencyConverter cc = new CurrencyConverter();
	
	double computeTransferAmount(int countryIndex, double amount) {
		return cc.computeTransferAmount(countryIndex, amount);
	}
	double computeTransferFee(int countryIndex, double amount) {
		return cc.computeTransferAmount(countryIndex, amount)*0.02;
	}
	
	
	public static void main(String[] args) {
		MoneyTransferService mts = new MoneyTransferService();
		System.out.println( mts.computeTransferAmount(0, 1000)); //63000.0
		System.out.println( mts.computeTransferFee(0, 1000)); //1260.0
	}
}
