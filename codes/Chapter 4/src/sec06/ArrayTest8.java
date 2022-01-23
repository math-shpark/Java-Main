package sec06;

public class ArrayTest8 {

	public static void main(String[] args) {

		// 원본 배열 생성
		String[] oldStrArray = { "java", "array", "copy" };

		// 붙여 넣을 배열 생성
		String[] newStrArray = new String[5];

		// 복사하는 메소드 실행
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		// 결과 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}

	}

}
