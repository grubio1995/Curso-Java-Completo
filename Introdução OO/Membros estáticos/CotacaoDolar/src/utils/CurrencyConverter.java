package utils;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double amountPaidInReais(double dolarPrice, double amount) {
		return (amount * dolarPrice) + (amount * dolarPrice * IOF);
	}

}
