package sec05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {
	public static void main(String[] args) throws Exception {

		// ��½�Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		// ��������½�Ʈ�� ����
		DataOutputStream dos = new DataOutputStream(fos);

		// ���ڿ� �ۼ�
		dos.writeUTF("ȫ�浿");
		// doubleŸ�� ���� �ۼ�
		dos.writeDouble(95.5);
		// intŸ�� ���� �ۼ�
		dos.writeInt(1);

		// ���ڿ� �ۼ�
		dos.writeUTF("���ڹ�");
		// doubleŸ�� ���� �ۼ�
		dos.writeDouble(90.3);
		// intŸ�� ���� �ۼ�
		dos.writeInt(2);

		// ���� ����
		dos.flush();
		// ��������½�Ʈ�� �ݱ�
		dos.close();
		// ��½�Ʈ�� �ݱ�
		fos.close();

		// �Է½�Ʈ�� ����
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		// �������Է½�Ʈ�� ����
		DataInputStream dis = new DataInputStream(fis);

		// ����� ������ �д� �ݺ���
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}

		// �������Է½�Ʈ�� �ݱ�
		dis.close();
		// �Է½�Ʈ�� �ݱ�
		fis.close();
	}
}
