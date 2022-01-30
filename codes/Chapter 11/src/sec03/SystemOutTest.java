package sec03;

import java.io.OutputStream;

public class SystemOutTest {
	public static void main(String[] args) throws Exception {

		// ��½�Ʈ�� �ʵ�
		OutputStream os = System.out;

		// �ƽ�Ű�ڵ� 48���� 57���� �ۼ�
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}

		// �����ǵ��� �ƽ�Ű�ڵ� 10�� ����ϸ� ���� ������ �Ѿ
		os.write(10);

		// �ƽ�Ű�ڵ� 97���� 122���� �ۼ�
		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}

		// �����ǵ��� �ƽ�Ű�ڵ� 10�� ����ϸ� ���� ������ �Ѿ
		os.write(10);

		// ���ڿ�
		String hangul = "�����ٶ󸶹ٻ������īŸ����";
		
		// ���ڿ��� byte�� ��ȯ�Ͽ� �迭�� ����
		byte[] hangulBytes = hangul.getBytes();
		
		// �迭�� ����� ���ڿ� �ۼ�
		os.write(hangulBytes);

		// ����
		os.flush();

	}
}
