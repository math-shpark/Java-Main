package sec05;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {
	public static void main(String[] args) throws Exception {

		// 바이트입력스트림
		InputStream is = System.in;
		// Reader 타입으로 변환
		Reader reader = new InputStreamReader(is);

		// 읽은 문자수를 저장할 변수 선언
		int readCharNo;
		// 읽은 문자를 저장할 배열 생성
		char[] cbuf = new char[100];

		// 읽은 문자를 콘솔에 출력하는 반복문
		while ((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}

		reader.close();
	}
}
