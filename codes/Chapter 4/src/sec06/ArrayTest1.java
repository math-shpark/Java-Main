package sec06;

public class ArrayTest1 {

	public static void main(String[] args) {

		// ���� ���� ��ü ����
		int[] scores = { 83, 90, 87 };

		// �迭�� ����� �� ���
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		// ���� ������ ���� ����
		int sum = 0;

		// sum ������ ���� ���ϴ� �ݺ���
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}

		// ��� ���
		System.out.println("���� : " + sum);

		// ��� ���
		double avg = (double) sum / 3;

		// ��� ���
		System.out.println("��� : " + avg);

	}

}
