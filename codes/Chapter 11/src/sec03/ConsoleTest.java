package sec03;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {

		// �ܼ� Ŭ���� ȣ��
		Console console = System.console();

		// ���̵� �Է� UI
		System.out.print("���̵�: ");

		// ���� ������ �������� ���ڿ��� String ��ü�� ����
		String id = console.readLine();

		// ��й�ȣ �Է� UI
		System.out.print("�н�����: ");

		// �Է��� ���ڸ� char Ÿ���� �迭�� ����
		char[] charPass = console.readPassword();

		// �迭�� ����� ���ڵ��� String ��ü�� ����
		String strPassword = new String(charPass);

		// ��� ���
		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(strPassword);

	}
}
