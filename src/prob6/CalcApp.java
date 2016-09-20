package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(">> ");

			String expression = scan.nextLine();

			if ("quit".equals(expression)) {
				break;
			}

			String[] tokens = expression.split(" ");
			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);
			char[] operator = tokens[1].toCharArray();
			
			Arith arith = null;
			switch (operator[0]) {
			case '+':
				arith = new Add();
				break;
			case '-':
				arith = new Sub();
				break;
			case '*':
				arith = new Mul();
				break;
			case '/':
				arith = new Div();
				break;
			default:
				break;
			}
			if(arith == null) {
				System.out.println(">>알수 없는 연산입니다.");
				continue;
			}
			
			arith.setValue(lValue, rValue);
			int result = arith.calculate();
			System.out.println(">>" + result);
		}
		scan.close();
	}
}
