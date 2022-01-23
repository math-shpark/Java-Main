package sec08;

public class Calculator {

	// 전원 키는 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	// 더하는 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	// 나누는 메소드
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	// 전원을 끄는 메소드
	void powerOff() {
		System.out.println("전원을 끕니다");
	}

}
