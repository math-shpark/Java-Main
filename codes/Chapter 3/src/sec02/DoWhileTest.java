package sec02;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");

		Scanner scanner = new Scanner(System.in);
		String inputString; // �Է��� ������ ������ ����

		do {
			System.out.print("> "); // �Է��� ĭ ǥ��

			inputString = scanner.nextLine(); // �Է��� �� ��������

			System.out.println(inputString); // �Է��� �� ���
		} while (!inputString.equals("q")); // �Է��� ���� q�̸� �ݺ��� ����

		System.out.println(); // 1�� ����
		System.out.println("���α׷� ����"); // ���α׷� ���� �޽��� ���

		scanner.close();

	}

}
