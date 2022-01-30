package sec03;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {

		// Scanner 클래스 호출
		Scanner scanner = new Scanner(System.in);

		// 문자열 입력 UI
		System.out.print("문자열 입력> ");

		// 입력한 문자열 읽기
		String inputString = scanner.nextLine();

		// 입력된 값 출력
		System.out.println(inputString);

		// 한 줄 띄기
		System.out.println();

		// 정수 입력 UI
		System.out.print("정수 입력> ");

		// 입력한 정수값 읽기
		int inputInt = scanner.nextInt();

		// 입력된 값 출력
		System.out.println(inputInt);

		// 한 줄 띄기
		System.out.println();

		// 실수 입력 UI
		System.out.print("실수 입력> ");

		// 입력한 실수값 읽기
		double inputDouble = scanner.nextDouble();

		// 입력된 값 출력
		System.out.println(inputDouble);

		// 종료
		scanner.close();
	}
}
