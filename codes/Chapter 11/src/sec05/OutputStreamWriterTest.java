package sec05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterTest {
	public static void main(String[] args) throws Exception {

		// ����Ʈ��½�Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		// Writer Ÿ������ ��ȯ
		Writer writer = new OutputStreamWriter(fos);

		// �Է°� ���ڿ�
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		// �Է°� ���Ͽ� �ۼ�
		writer.write(data);

		// ���� ����
		writer.flush();
		// ������
		writer.close();
		// ���� �޽��� ���
		System.out.println("���� ������ �������ϴ�.");
	}
}
