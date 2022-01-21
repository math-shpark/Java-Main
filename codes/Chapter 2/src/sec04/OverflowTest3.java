package sec04;

public class OverflowTest3 {

	public static void main(String[] args) {

		try {

			int result = safeAdd(2000000000, 2000000000);

			System.out.println(result);

		} catch (ArithmeticException e) {

			System.out.println("�����÷ο� �߻��Ͽ� ��� �Ұ�");

		}

	}

	public static int safeAdd(int left, int right) {

		if (right > 0) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}

		return left + right;

	}

}
