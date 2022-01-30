package sec05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderTest {
	public static void main(String[] args) throws Exception {

		// 입력스트림 생성
		InputStream is = System.in;
		// Reader 타입으로 변환
		Reader reader = new InputStreamReader(is);
		// 버퍼 보조스트림 생성
		BufferedReader br = new BufferedReader(reader);

		// 입력 UI
		System.out.print("입력: ");
		// 한 줄에 입력된 내용을 String 객체에 저장
		String lineString = br.readLine();

		// 결과 출력
		System.out.println("출력: " + lineString);
	}
}