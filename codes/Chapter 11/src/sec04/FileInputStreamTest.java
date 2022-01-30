package sec04;

import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		
		// FileNotFoundException ���� ó��		
		try {
			// FileInputStream ��ü ����
			FileInputStream fis = new FileInputStream(
					"C:\\dev\\thisisjava-sourcefile\\chap18\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
			
			// ���� ���� ���� ������ ����
			int data;
			
			// ���� ������ �а� ���� ���ڰ� ���� -1�� ��ȯ�ϱ� ������ �� ����Ʈ�� �о �ۼ��ϴ� �ݺ���
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			
			// �Է½�Ʈ�� ����
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
