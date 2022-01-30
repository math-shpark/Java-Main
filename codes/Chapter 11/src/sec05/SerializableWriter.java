package sec05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception {

		// ��½�Ʈ��
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// ��ü ��� ���� ��Ʈ��
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;

		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
	}
}
