package sec03;

import java.io.InputStream;

public class SystemInTest1 {

	public static void main(String[] args) throws Exception {

		// UI 화면
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요: ");

		// 입력스트림 변수
		InputStream is = System.in;
		
		// 읽은 문자의 아스키코드를 문자로 반환
		char inputChar = (char) is.read();
		
		// 입력한 문자에 따라 이동할 메뉴 분류
		switch (inputChar) {
		case '1':
			System.out.println("예금 조회를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("예금 출금를 선택하셨습니다.");
			break;
		case '3':
			System.out.println("예금 입금를 선택하셨습니다.");
			break;
		case '4':
			System.out.println("종료 하기를 선택하셨습니다.");
			break;
		}

	}

}
