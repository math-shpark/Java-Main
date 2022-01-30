package sec05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterTest {
	public static void main(String[] args) throws Exception {

		// 바이트출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		// Writer 타입으로 변환
		Writer writer = new OutputStreamWriter(fos);

		// 입력값 문자열
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		// 입력값 파일에 작성
		writer.write(data);

		// 버퍼 비우기
		writer.flush();
		// 끝내기
		writer.close();
		// 성공 메시지 출력
		System.out.println("파일 저장이 끝났습니다.");
	}
}
