package sec06;

public class ForEachTest {

	public static void main(String[] args) {

		// ���� ���� �迭 ����
		int[] scores = { 95, 71, 84, 93, 87 };

		// ������ ������ ���� ����
		int sum = 0;

		// ���� �ݺ���
		for (int score : scores) {
			sum = sum + score;
		}

		// ��� ���
		System.out.println("���� ���� = " + sum);

		// ��� ���
		double avg = (double) sum / scores.length;

		// ��� ���
		System.out.println("���� ��� = " + avg);

	}

}
