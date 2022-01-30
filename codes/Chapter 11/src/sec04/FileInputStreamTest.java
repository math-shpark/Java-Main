package sec04;

import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		
		// FileNotFoundException 예외 처리		
		try {
			// FileInputStream 객체 생성
			FileInputStream fis = new FileInputStream(
					"C:\\dev\\thisisjava-sourcefile\\chap18\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
			
			// 읽은 문자 수를 저장할 변수
			int data;
			
			// 파일 내용을 읽고 읽을 문자가 없어 -1을 반환하기 전까지 한 바이트씩 읽어서 작성하는 반복문
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			
			// 입력스트림 종료
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
