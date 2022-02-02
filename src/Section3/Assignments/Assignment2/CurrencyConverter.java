package Section3.Assignments.Assignment2;

public class CurrencyConverter {
	double[] exchangeRates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
	
	void printCurrencies() {
		System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: " + exchangeRates[2]);
        System.out.println("chilean_peso: " + exchangeRates[3]);
        System.out.println("mexican_peso: " + exchangeRates[4]);
        System.out.println("_yen: " + exchangeRates[5]);
        System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);

	}
	
	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();
	}
}
