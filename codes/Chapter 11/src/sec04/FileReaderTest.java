package sec04;

import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) throws Exception {

		// fileReader ��ü ���� �� ��� �Է�
		FileReader fr = new FileReader("���� ���");

		// ���� ���� ���� ������ ���� ����
		int readCharNo;
		// ���� ���ڸ� ������ �迭 ����
		char[] cbuf = new char[100];

		// ���� ���ڰ� ��� -1�� ��ȯ�� ������ ���� ���ڸ� �迭�� ������ �� ������ ������ �ֿܼ� ���
		// �� ���� �迭�� ������ 100���� ���ڸ� �����鼭 �ݺ��� ����
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();

	}
}
