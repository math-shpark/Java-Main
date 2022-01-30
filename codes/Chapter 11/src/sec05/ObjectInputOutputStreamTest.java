package sec05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamTest {
	public static void main(String[] args) throws Exception {

		// ��½�Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// ��ü ��� ������Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// ����ȭ
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("ȫ�浿"));

		// ���� ����
		oos.flush();
		// ��ü ��� ������Ʈ�� �ݱ�
		oos.close();
		// ��½�Ʈ�� ����
		fos.close();

		// �Է½�Ʈ�� ����
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		// ��ü �Է� ������Ʈ�� ����
		ObjectInputStream ois = new ObjectInputStream(fis);

		// ������ȭ
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();

		// ��ü �Է� ������Ʈ�� �ݱ�
		ois.close();
		// �Է½�Ʈ�� �ݱ�
		fis.close();

		// ��� ���
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
	}
}