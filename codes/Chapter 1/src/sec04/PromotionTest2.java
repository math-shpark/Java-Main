package sec04;

public class PromotionTest2 {

	public static void main(String[] args) {

		byte b1 = 127;
		char c1 = '가';
		int i1;
		double d1;

		System.out.println("자동 형변환의 결과");
		i1 = b1; // 127이라는 값이 1byte에서 4byte로 표현됨

		System.out.println("i1 = b1의 형변환 " + i1);
		i1 = c1; // '가'를 유니코드로 표현한 십진수 값(44032)가 i1에 저장됨

		System.out.println("i1 = c1의 형변환 " + i1);
		d1 = i1; // i1에 저장된 44032가 44032.0으로 8byte 실수로 전환되어 저장됨

		System.out.println("d1 = i1의 형변환 " + d1);

	}

}
