package sec06;

public class ArrayTest7 {

	public static void main(String[] args) {

		// 원본 배열 생성
		int[] oldIntArray = { 1, 2, 3 };

		// 붙여넣을 배열 생성
		int[] newIntArray = new int[5];

		// 원본 배열 데이터를 새로운 배열에 붙여넣는 반복문
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		// 결과 출력
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}

	}

}
