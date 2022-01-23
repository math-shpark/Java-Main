package sec08;

public class Calculator2 {

	// 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y); // plus 메소드 호출
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10); // avg 메소드 호출
		println("실행결과: " + result);
	}

	void println(String message) {
		System.out.println(message);
	}

}
