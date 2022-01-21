package sec02;

public class WhileTest2 {

	public static void main(String[] args) {

		// 합을 저장할 변수
		int sum = 0;

		// 더할 숫자
		int i = 1;

		// 100까지 더하는 반복문
		while (i <= 100) {
			sum += i;
			i++;
		}

		// 결과 출력
		System.out.println("1~" + (i - 1) + " 합 : " + sum);

	}

}
