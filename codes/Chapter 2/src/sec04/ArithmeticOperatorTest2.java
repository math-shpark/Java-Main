package sec04;

public class ArithmeticOperatorTest2 {

	public static void main(String[] args) {

		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1; // 1과 연산되기 때문에 int 타입으로 산출되어야 함
		char c3 = (char) (c2 + 1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
