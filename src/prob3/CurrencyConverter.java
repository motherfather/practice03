package prob3;

public class CurrencyConverter {

	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	
	public static double toDollar(double won) {
		double dollar = (1 / rate) * won;
		return dollar;
	}
	
	public static double toKRW(double dollar) {
		double won = rate * dollar;
		return won;
	}

}
