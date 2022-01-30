package sec05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamTest {
	public static void main(String[] args) throws Exception {

		// 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// 객체 출력 보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// 직렬화
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("홍길동"));

		// 버퍼 비우기
		oos.flush();
		// 객체 출력 보조스트림 닫기
		oos.close();
		// 출력스트림 생성
		fos.close();

		// 입력스트림 생성
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		// 객체 입력 보조스트림 생성
		ObjectInputStream ois = new ObjectInputStream(fis);

		// 역직렬화
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();

		// 객체 입력 보조스트림 닫기
		ois.close();
		// 입력스트림 닫기
		fis.close();

		// 결과 출력
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
	}
}
