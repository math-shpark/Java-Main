package sec02;

public class ForTest2 {

	public static void main(String[] args) {

		// ���� ������ ���� ����
		int sum = 0;

		// �ݺ��� �ʱ�ȭ��
		int i = 0;

		// ���� ���ϴ� �ݺ���
		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		// ��� ���
		System.out.println("1~" + (i - 1) + " �� : " + sum);

	}

}
