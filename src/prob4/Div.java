package prob4;

public class Div {
	private double a;
	private double b;
	public void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double calculate() {
		double sum = 0;
		sum = a / b;
		return sum;
	}

}
