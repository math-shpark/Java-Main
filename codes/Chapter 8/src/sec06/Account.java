package sec06;

public class Account {
	private long balance;

	public Account() {
	}

	// �ܰ� ��ȸ �޼ҵ�
	public long getBalance() {
		return balance;
	}

	// �Ա� �޼ҵ�
	public void deposit(int money) {
		balance += money;
	}

	// ��� �޼ҵ�
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("�ܰ����:" + (money - balance) + " ���ڶ�");
		}
		balance -= money;
	}
}
