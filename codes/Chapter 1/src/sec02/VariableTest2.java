package sec02;

public class VariableTest2 {

	public static void main(String[] args) {

		// 개인정보
		String name = "홍길동";
		int age = 26;
		int height = 170;
		int weight = 65;

		// 개인정보 출력
		System.out.printf("고객님 이름은 %s이고, 나이는 %d입니다.", name, age);
		System.out.println("");
		System.out.printf("고객님 신체정보는 키 %dcm이고 체중은 %dkg입니다.", height, weight);

	}

}
