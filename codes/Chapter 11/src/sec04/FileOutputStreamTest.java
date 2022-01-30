package sec04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
	public static void main(String[] args) throws Exception {

		// ������ ���� ��θ� String ��ü�� ����
		String originalFileName = "C:/JavaProgramming/source/chap18/src/sec04/exam03_fileoutputstream/house.jpg";
		// �ٿ����� ���� ��θ� String ��ü�� ����
		String targetFileName = "C:/Temp/house.jpg";

		// �Է� ��Ʈ�� ��ü ����
		FileInputStream fis = new FileInputStream(originalFileName);
		// ��� ��Ʈ�� ��ü ����
		FileOutputStream fos = new FileOutputStream(targetFileName);

		// ���� ���� ���� ������ ����
		int readByteNo;
		// ���� ���ڸ� ������ �迭
		byte[] readBytes = new byte[100];

		// ���� ���ڰ� ��� -1�� ��ȯ�ϱ� ������ ���� ���ڸ� �ۼ�
		// �� ���� 100����Ʈ�� �о� readBytes�� �����ϰ� 100�� readByteNo�� ����
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}

		// ���� ����
		fos.flush();
		// ��� ��Ʈ�� ����
		fos.close();
		// �Է� ��Ʈ�� ����
		fis.close();

		System.out.println("���簡 �� �Ǿ����ϴ�.");
	}
}
