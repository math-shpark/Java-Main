package sec02;

public class ForTest2 {

	public static void main(String[] args) {

		// 합을 저장할 변수 지정
		int sum = 0;

		// 반복문 초기화식
		int i = 0;

		// 합을 구하는 반복문
		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		// 결과 출력
		System.out.println("1~" + (i - 1) + " 합 : " + sum);

	}

}
