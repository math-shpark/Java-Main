package sec03;

import java.io.InputStream;

public class SystemInTest2 {
	public static void main(String[] args) throws Exception {

		// �Է½�Ʈ�� ����
		InputStream is = System.in;

		// ���ڿ��� ������ �迭(���� 100)
		byte[] datas = new byte[100];

		// �̸� �Է��� ĭ UI
		System.out.print("�̸�: ");

		// �Է��� ���ڸ� ���� ���� ���� ��ȯ
		int nameBytes = is.read(datas);

		// �Է��� ���ڸ� String ��ü�� ����
		// �������� 2���� �� ���� : Enter Ű�� �ش��ϴ� �κ��̶� ����
		String name = new String(datas, 0, nameBytes - 2);

		// �ϰ� ���� ���� �Է��� UI
		System.out.print("�ϰ� ������: ");

		// �Է��� ���ڿ� ���� ���� ���� ���� ��ȯ
		int commentBytes = is.read(datas);

		// �Է��� ���ڸ� String ��ü�� ����
		String comment = new String(datas, 0, commentBytes - 2);

		// �Է¹��� �� ���
		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�Է��� �ϰ� ������: " + comment);

	}
}
