package sec02;

public class BreakTest1 {

	public static void main(String[] args) {

		while (true) {
			int num = (int) (Math.random() * 6) + 1; // ���� ���� ��������

			System.out.println(num); // ���� ���� ���

			// ���� ���ڰ� 6�̸� �ݺ��� ����
			if (num == 6) {
				break;
			}
		}

		System.out.println("���α׷� ����");

	}

}
