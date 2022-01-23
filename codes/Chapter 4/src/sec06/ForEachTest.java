package sec06;

public class ForEachTest {

	public static void main(String[] args) {

		// 점수 저장 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };

		// 총합을 저장할 변수 생성
		int sum = 0;

		// 향상된 반복문
		for (int score : scores) {
			sum = sum + score;
		}

		// 결과 출력
		System.out.println("점수 총합 = " + sum);

		// 평균 계산
		double avg = (double) sum / scores.length;

		// 결과 출력
		System.out.println("점수 평균 = " + avg);

	}

}
