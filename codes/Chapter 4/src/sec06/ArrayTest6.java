package sec06;

public class ArrayTest6 {

	public static void main(String[] args) {

		// 배열 객체 생성
		String[] strArray = new String[3];

		// 인덱스별 객체 저장
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]); // 같은 객체를 참조하므로 true
		System.out.println(strArray[0] == strArray[2]); // 다른 객체를 참조하므로 false
		System.out.println(strArray[0].equals(strArray[2])); // 문자열은 같으므로 true

	}

}
