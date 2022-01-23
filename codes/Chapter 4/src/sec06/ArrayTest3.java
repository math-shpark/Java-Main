package sec06;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 정수 타입 배열 1 생성
		int[] arr1 = new int[3];

		// 초기 상태 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		// 인덱스별 데이터 입력
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		// 데이터 입력 후 상태 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		// 실수 타입 배열 2 생성
		double[] arr2 = new double[3];

		// 초기 상태 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		// 인덱스별 데이터 입력
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;

		// 데이터 입력 후 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		// 문자열 타입 배열 3 생성
		String[] arr3 = new String[3];

		// 초기 상태 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		// 인덱스별 데이터 입력
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";

		// 데이터 입력 후 상태 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

	}

}
