package sec06;

public class ArrayTest2 {

	public static void main(String[] args) {

		// ������ ������ �迭 ����
		int[] scores;

		// ��ü�� ������ �� �� ����
		scores = new int[] { 83, 90, 87 };

		// �ݺ������� �� ����� ������ ���� ����
		int sum1 = 0;

		// �ݺ������� �迭 ��� ���� ���
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}

		// �ݺ������� ���� ���� ���
		System.out.println("���� : " + sum1);

		// ������ �޼ҵ�� ���� ����� ������ ���� ����
		int sum2 = add(new int[] { 83, 90, 87 });

		// �޼ҵ�� ���� ���� ���
		System.out.println("���� : " + sum2);

	}

	// ���� ���ϴ� �޼ҵ� ����
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
