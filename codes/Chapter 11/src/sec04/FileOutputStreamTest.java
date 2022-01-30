package sec04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
	public static void main(String[] args) throws Exception {

		// 복사할 파일 경로를 String 객체에 저장
		String originalFileName = "C:/JavaProgramming/source/chap18/src/sec04/exam03_fileoutputstream/house.jpg";
		// 붙여넣을 파일 경로를 String 객체에 저장
		String targetFileName = "C:/Temp/house.jpg";

		// 입력 스트림 객체 생성
		FileInputStream fis = new FileInputStream(originalFileName);
		// 출력 스트림 객체 생성
		FileOutputStream fos = new FileOutputStream(targetFileName);

		// 읽은 문자 수를 대입할 변수
		int readByteNo;
		// 읽은 문자를 저장할 배열
		byte[] readBytes = new byte[100];

		// 읽은 문자가 없어서 -1을 반환하기 전까지 읽은 문자를 작성
		// 한 번에 100바이트를 읽어 readBytes에 저장하고 100을 readByteNo에 저장
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}

		// 버퍼 비우기
		fos.flush();
		// 출력 스트림 종료
		fos.close();
		// 입력 스트림 종료
		fis.close();

		System.out.println("복사가 잘 되었습니다.");
	}
}
