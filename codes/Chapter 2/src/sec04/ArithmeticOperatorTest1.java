package sec04;

public class ArithmeticOperatorTest1 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;

		int result1 = a + b;
		System.out.println(result1);

		int result2 = a - b;
		System.out.println(result2);

		int result3 = a * b;
		System.out.println(result3);

		int result4 = a / b; // ��Ȯ�� ���� 1.66X������ ���� Ÿ������ ����Ǿ� 1�� ��µ�
		System.out.println(result4);

		int result5 = a % b;
		System.out.println(result5);

		double result6 = (double) a / b; // �Ǽ� Ÿ���� ����ȯ�� �̷���� �Ǽ� Ÿ���� 1.66X�� ��µ�
		System.out.println(result6);

	}

}
