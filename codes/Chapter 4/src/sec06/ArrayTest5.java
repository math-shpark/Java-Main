package sec06;

public class ArrayTest5 {

	public static void main(String[] args) {

		// 수학 점수를 저장할 2차원 배열 생성
		int[][] mathScores = new int[2][3];

		// 반복문을 이용하여 배열 상태 출력
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}

		System.out.println();

		// 영어 점수를 저장할 2차원 배열 생성
		int[][] englishScores = new int[2][];

		// 1행에 길이 2인 배열 생성
		englishScores[0] = new int[2];

		// 2행에 길이 3인 배열 생성
		englishScores[1] = new int[3];

		// 반복문을 이용하여 배열 상태 출력
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}

		System.out.println();

		// 자바 점수를 저장할 2차원 배열 생성 및 값 저장
		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };

		// 반복문을 이용하여 배열 상태 출력
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}

	}

}
