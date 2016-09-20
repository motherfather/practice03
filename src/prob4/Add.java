package prob4;

public class Add {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		int sum = 0; // 인스턴스 변수(?)라서 초기화 안해도 됨!!!
		sum = a + b;
		return sum;
	}

}
