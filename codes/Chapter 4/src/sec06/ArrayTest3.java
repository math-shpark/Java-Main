package sec06;

public class ArrayTest3 {

	public static void main(String[] args) {

		// ���� Ÿ�� �迭 1 ����
		int[] arr1 = new int[3];

		// �ʱ� ���� ���
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		// �ε����� ������ �Է�
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		// ������ �Է� �� ���� ���
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		// �Ǽ� Ÿ�� �迭 2 ����
		double[] arr2 = new double[3];

		// �ʱ� ���� ���
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		// �ε����� ������ �Է�
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;

		// ������ �Է� �� ���
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		// ���ڿ� Ÿ�� �迭 3 ����
		String[] arr3 = new String[3];

		// �ʱ� ���� ���
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		// �ε����� ������ �Է�
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";

		// ������ �Է� �� ���� ���
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

	}

}
