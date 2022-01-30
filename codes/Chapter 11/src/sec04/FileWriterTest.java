package sec04;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {
	public static void main(String[] args) throws Exception {
		
		// 파일 경로에 해당하는 파일 객체 생성
		File file = new File("C:/Temp/file.txt");	
		// 파일 경로에 해당하는 파일에 이어서 작성하기 위해 true 매개값 추가
		FileWriter fw = new FileWriter(file, true);		
		
		// 파일에 작성할 문자열 입력
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		// 버퍼 비우기
		fw.flush();
		// 출력스트림 종료
		fw.close();
		
		// 완료 메시지 출력
		System.out.println("파일에 저장되었습니다.");
	}
}

