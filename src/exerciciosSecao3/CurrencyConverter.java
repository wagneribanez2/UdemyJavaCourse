package exerciciosSecao3;

public class CurrencyConverter {
	public static final double IOF = 1.06;		
	
	public static double amount(double dollarPrice, int quantity) {
		return dollarPrice * quantity * IOF;
	}
}
