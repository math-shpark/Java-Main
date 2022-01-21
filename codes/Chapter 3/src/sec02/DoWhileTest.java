package sec02;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inputString; // 입력한 내용을 저장할 변수

		do {
			System.out.print("> "); // 입력할 칸 표시

			inputString = scanner.nextLine(); // 입력한 값 가져오기

			System.out.println(inputString); // 입력한 값 출력
		} while (!inputString.equals("q")); // 입력한 값이 q이면 반복문 종료

		System.out.println(); // 1줄 간격
		System.out.println("프로그램 종료"); // 프로그램 종료 메시지 출력

		scanner.close();

	}

}
