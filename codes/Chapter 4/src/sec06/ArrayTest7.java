package sec06;

public class ArrayTest7 {

	public static void main(String[] args) {

		// ���� �迭 ����
		int[] oldIntArray = { 1, 2, 3 };

		// �ٿ����� �迭 ����
		int[] newIntArray = new int[5];

		// ���� �迭 �����͸� ���ο� �迭�� �ٿ��ִ� �ݺ���
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		// ��� ���
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}

	}

}
