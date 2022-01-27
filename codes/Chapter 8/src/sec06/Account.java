package sec06;

public class Account {
	private long balance;

	public Account() {
	}

	// 잔고 조회 메소드
	public long getBalance() {
		return balance;
	}

	// 입금 메소드
	public void deposit(int money) {
		balance += money;
	}

	// 출금 메소드
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
