package sec02;

public class WhileTest3 {

	public static void main(String[] args) throws Exception {

		boolean run = true; // ���α׷� ���� ����
		int speed = 0; // �ӵ� ���� ����
		int keyCode = 0; // Ű���� �Է°� ���� ����

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("-----------------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("-----------------------------");
				System.out.print("����: ");
			}

			keyCode = System.in.read();

			if (keyCode == 49) { // 1
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 50) { // 2
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 51) { // 3
				run = false;
			}
		}

		System.out.println("���α׷� ����");

	}
}
