package sec05;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {
	public static void main(String[] args) throws Exception {

		// ����Ʈ�Է½�Ʈ��
		InputStream is = System.in;
		// Reader Ÿ������ ��ȯ
		Reader reader = new InputStreamReader(is);

		// ���� ���ڼ��� ������ ���� ����
		int readCharNo;
		// ���� ���ڸ� ������ �迭 ����
		char[] cbuf = new char[100];

		// ���� ���ڸ� �ֿܼ� ����ϴ� �ݺ���
		while ((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}

		reader.close();
	}
}
