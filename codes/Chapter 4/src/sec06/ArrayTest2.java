package sec06;

public class ArrayTest2 {

	public static void main(String[] args) {

		// 점수를 저장할 배열 선언
		int[] scores;

		// 객체를 생성한 후 값 저장
		scores = new int[] { 83, 90, 87 };

		// 반복문으로 합 결과를 저장할 변수 생성
		int sum1 = 0;

		// 반복문으로 배열 요소 총합 계산
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}

		// 반복문으로 구한 총합 출력
		System.out.println("총합 : " + sum1);

		// 정의한 메소드로 합의 결과를 저장할 변수 생성
		int sum2 = add(new int[] { 83, 90, 87 });

		// 메소드로 구한 총합 출력
		System.out.println("총합 : " + sum2);

	}

	// 합을 구하는 메소드 정의
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
