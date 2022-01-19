package sec02;

public class VariableScopeTest2 {

	int sum; // 전역 변수

	public void addScore(int javaScore) { // 지역 변수
		int score = javaScore; // 지역 변수
		sum = sum + score;
	}

	public int getSum() {
		return sum;
	}

}
