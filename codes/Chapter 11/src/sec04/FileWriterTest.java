package sec04;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {
	public static void main(String[] args) throws Exception {
		
		// ���� ��ο� �ش��ϴ� ���� ��ü ����
		File file = new File("C:/Temp/file.txt");	
		// ���� ��ο� �ش��ϴ� ���Ͽ� �̾ �ۼ��ϱ� ���� true �Ű��� �߰�
		FileWriter fw = new FileWriter(file, true);		
		
		// ���Ͽ� �ۼ��� ���ڿ� �Է�
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
		
		// ���� ����
		fw.flush();
		// ��½�Ʈ�� ����
		fw.close();
		
		// �Ϸ� �޽��� ���
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}

