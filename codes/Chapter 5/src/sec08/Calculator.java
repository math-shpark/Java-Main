package sec08;

public class Calculator {

	// ���� Ű�� �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	// ���ϴ� �޼ҵ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	// ������ �޼ҵ�
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	// ������ ���� �޼ҵ�
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}

}
