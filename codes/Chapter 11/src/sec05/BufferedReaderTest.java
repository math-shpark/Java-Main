package sec05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderTest {
	public static void main(String[] args) throws Exception {

		// �Է½�Ʈ�� ����
		InputStream is = System.in;
		// Reader Ÿ������ ��ȯ
		Reader reader = new InputStreamReader(is);
		// ���� ������Ʈ�� ����
		BufferedReader br = new BufferedReader(reader);

		// �Է� UI
		System.out.print("�Է�: ");
		// �� �ٿ� �Էµ� ������ String ��ü�� ����
		String lineString = br.readLine();

		// ��� ���
		System.out.println("���: " + lineString);
	}
}