package sec05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {
	public static void main(String[] args) throws Exception {

		// 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		// 데이터출력스트림 생성
		DataOutputStream dos = new DataOutputStream(fos);

		// 문자열 작성
		dos.writeUTF("홍길동");
		// double타입 변수 작성
		dos.writeDouble(95.5);
		// int타입 변수 작성
		dos.writeInt(1);

		// 문자열 작성
		dos.writeUTF("감자바");
		// double타입 변수 작성
		dos.writeDouble(90.3);
		// int타입 변수 작성
		dos.writeInt(2);

		// 버퍼 비우기
		dos.flush();
		// 데이터출력스트림 닫기
		dos.close();
		// 출력스트림 닫기
		fos.close();

		// 입력스트림 생성
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		// 데이터입력스트림 생성
		DataInputStream dis = new DataInputStream(fis);

		// 출력한 순서로 읽는 반복문
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}

		// 데이터입력스트림 닫기
		dis.close();
		// 입력스트림 닫기
		fis.close();
	}
}
