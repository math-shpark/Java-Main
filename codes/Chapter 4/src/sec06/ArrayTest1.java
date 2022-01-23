package sec06;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 점수 저장 객체 생성
		int[] scores = { 83, 90, 87 };

		// 배열에 저장된 값 출력
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		// 합을 저장할 변수 생성
		int sum = 0;

		// sum 변수에 값을 더하는 반복문
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}

		// 결과 출력
		System.out.println("총합 : " + sum);

		// 평균 계산
		double avg = (double) sum / 3;

		// 결과 출력
		System.out.println("평균 : " + avg);

	}

}
