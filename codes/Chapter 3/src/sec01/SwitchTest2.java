package sec01;

public class SwitchTest2 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8; // ����ð� �������� �ޱ�
		
		System.out.println("[����ð�: " + time + " ��]");

		switch (time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		default:
			System.out.println("�ܱ��� �����ϴ�.");
		}

	}

}