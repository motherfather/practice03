package prob2;

public class Account {

	private String accountNo;
	private int balance = 0;

	public Account(String num) {
		this.setAccountNo(num);
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}

	public void save(int money) {
		balance += money;
		this.setBalance(balance);
		System.out.println(accountNo + " 계좌에 " + money + "만원이 입금되었습니다.");
	}

	public void deposit(int money) {
		balance -= money;
		this.setBalance(balance);
		System.out.println(accountNo + " 계좌에 " + money + "만원이 출금되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
