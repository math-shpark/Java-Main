package sec02;

public class VariableScopeTest2 {

	int sum; // ���� ����

	public void addScore(int javaScore) { // ���� ����
		int score = javaScore; // ���� ����
		sum = sum + score;
	}

	public int getSum() {
		return sum;
	}

}
