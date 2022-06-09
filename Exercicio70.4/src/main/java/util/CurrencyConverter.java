package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double amount(double dollar, double buyDollar) {
		return dollar * buyDollar + (dollar * buyDollar * IOF);
	}
}
