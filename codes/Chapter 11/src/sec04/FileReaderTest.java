package sec04;

import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) throws Exception {

		// fileReader 객체 생성 및 경로 입력
		FileReader fr = new FileReader("파일 경로");

		// 읽은 문자 수를 대입할 변수 선언
		int readCharNo;
		// 읽은 문자를 저장할 배열 선언
		char[] cbuf = new char[100];

		// 읽은 문자가 없어서 -1을 반환할 때까지 읽은 문자를 배열에 저장한 후 저장한 내용을 콘솔에 출력
		// 한 번에 배열의 길이인 100개의 문자를 읽으면서 반복문 루핑
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();

	}
}
