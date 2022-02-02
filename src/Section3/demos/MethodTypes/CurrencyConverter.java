package Section3.demos.MethodTypes;

public class CurrencyConverter {
	double[] exchangeRates;
	
	void setExchangeRates(double[] rates) {
		exchangeRates = rates;
	}
	
	void updateExchangeRates(int arrayIndex, double newVal) {
		exchangeRates[arrayIndex] = newVal;
	}
	
	double getExchangeRate(int arrayIndex) {
		return exchangeRates[arrayIndex];
	}
	double computeTranserAmount(int arrayIndex, double amount) {
		return getExchangeRate(arrayIndex)*amount;
	}
	
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
		double[] rates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0}; //intially
		cc.setExchangeRates(rates);
		cc.printCurrencies(); 
		// we cannot call printCurrencies statically
		
		
		
		rates = new double[] {1,1,1,1,1,1,1}; 
		// this would not compile: rates = {1,1,1,1,1,1,1};
		
		cc.setExchangeRates(rates);
		cc.printCurrencies(); // all 1
		
		cc.updateExchangeRates(1, 23.3);
		cc.printCurrencies(); //dirham: 23.3
		
	}

}
