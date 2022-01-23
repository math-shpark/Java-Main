package sec06;

public class ArrayTest4 {

	public static void main(String[] args) {

		// 배열 생성
		int[] scores = { 83, 90, 87 };

		// 합을 저장할 변수 생성
		int sum = 0;

		// 인덱스별 데이터를 sum에 더하는 반복문
		// 조건식에 length 필드 적용
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		// 결과 출력
		System.out.println("총합 : " + sum);

		// 평균 계산
		double avg = (double) sum / scores.length;

		// 결과 출력
		System.out.println("평균 : " + avg);

	}

}
