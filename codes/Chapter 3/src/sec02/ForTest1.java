package sec02;

public class ForTest1 {

	public static void main(String[] args) {

		int sum = 0; // 합을 저장할 변수

		// 수를 차례대로 더하는 반복문
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		// 결과 출력
		System.out.println("1~100 합 : " + sum);

	}

}
