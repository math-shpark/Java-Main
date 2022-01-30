package sec03;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {

		// 콘솔 클래스 호출
		Console console = System.console();

		// 아이디 입력 UI
		System.out.print("아이디: ");

		// 엔터 누르기 전까지의 문자열을 String 객체에 저장
		String id = console.readLine();

		// 비밀번호 입력 UI
		System.out.print("패스워드: ");

		// 입력한 문자를 char 타입의 배열에 저장
		char[] charPass = console.readPassword();

		// 배열에 저장된 문자들을 String 객체에 저장
		String strPassword = new String(charPass);

		// 결과 출력
		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(strPassword);

	}
}
