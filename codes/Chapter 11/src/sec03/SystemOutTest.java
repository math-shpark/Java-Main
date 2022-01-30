package sec03;

import java.io.OutputStream;

public class SystemOutTest {
	public static void main(String[] args) throws Exception {

		// 출력스트림 필드
		OutputStream os = System.out;

		// 아스키코드 48부터 57까지 작성
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}

		// 라인피드의 아스키코드 10을 출력하면 다음 행으로 넘어감
		os.write(10);

		// 아스키코드 97부터 122까지 작성
		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}

		// 라인피드의 아스키코드 10을 출력하면 다음 행으로 넘어감
		os.write(10);

		// 문자열
		String hangul = "가나다라마바사아자차카타파하";
		
		// 문자열을 byte로 변환하여 배열에 저장
		byte[] hangulBytes = hangul.getBytes();
		
		// 배열에 저장된 문자열 작성
		os.write(hangulBytes);

		// 비우기
		os.flush();

	}
}
