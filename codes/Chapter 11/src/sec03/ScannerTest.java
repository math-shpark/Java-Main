package sec03;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {

		// Scanner Ŭ���� ȣ��
		Scanner scanner = new Scanner(System.in);

		// ���ڿ� �Է� UI
		System.out.print("���ڿ� �Է�> ");

		// �Է��� ���ڿ� �б�
		String inputString = scanner.nextLine();

		// �Էµ� �� ���
		System.out.println(inputString);

		// �� �� ���
		System.out.println();

		// ���� �Է� UI
		System.out.print("���� �Է�> ");

		// �Է��� ������ �б�
		int inputInt = scanner.nextInt();

		// �Էµ� �� ���
		System.out.println(inputInt);

		// �� �� ���
		System.out.println();

		// �Ǽ� �Է� UI
		System.out.print("�Ǽ� �Է�> ");

		// �Է��� �Ǽ��� �б�
		double inputDouble = scanner.nextDouble();

		// �Էµ� �� ���
		System.out.println(inputDouble);

		// ����
		scanner.close();
	}
}
