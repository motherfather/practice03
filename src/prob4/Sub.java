package prob4;

public class Sub {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		int sum = 0;
		sum = a - b;
		return sum;
	}

}
