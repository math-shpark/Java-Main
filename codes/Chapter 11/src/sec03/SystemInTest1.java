package sec03;

import java.io.InputStream;

public class SystemInTest1 {

	public static void main(String[] args) throws Exception {

		// UI ȭ��
		System.out.println("== �޴� ==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.print("�޴��� �����ϼ���: ");

		// �Է½�Ʈ�� ����
		InputStream is = System.in;
		
		// ���� ������ �ƽ�Ű�ڵ带 ���ڷ� ��ȯ
		char inputChar = (char) is.read();
		
		// �Է��� ���ڿ� ���� �̵��� �޴� �з�
		switch (inputChar) {
		case '1':
			System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
			break;
		case '2':
			System.out.println("���� ��ݸ� �����ϼ̽��ϴ�.");
			break;
		case '3':
			System.out.println("���� �Աݸ� �����ϼ̽��ϴ�.");
			break;
		case '4':
			System.out.println("���� �ϱ⸦ �����ϼ̽��ϴ�.");
			break;
		}

	}

}
