package sec02;

public class ForTest4 {

	public static void main(String[] args) {

		// m�� ��, n�� ���ϴ� ���� ������ ���� �ݺ���
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "�� ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n)); // ��� ���
			}
		}

	}

}
