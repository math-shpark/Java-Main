package sec02;

public class WhileTest2 {

	public static void main(String[] args) {

		// ���� ������ ����
		int sum = 0;

		// ���� ����
		int i = 1;

		// 100���� ���ϴ� �ݺ���
		while (i <= 100) {
			sum += i;
			i++;
		}

		// ��� ���
		System.out.println("1~" + (i - 1) + " �� : " + sum);

	}

}
