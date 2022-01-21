package sec02;

public class ForTest4 {

	public static void main(String[] args) {

		// m이 단, n이 곱하는 수인 구구단 실행 반복문
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n)); // 결과 출력
			}
		}

	}

}
