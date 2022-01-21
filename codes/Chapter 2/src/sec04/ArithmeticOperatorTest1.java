package sec04;

public class ArithmeticOperatorTest1 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;

		int result1 = a + b;
		System.out.println(result1);

		int result2 = a - b;
		System.out.println(result2);

		int result3 = a * b;
		System.out.println(result3);

		int result4 = a / b; // 정확한 값은 1.66X이지만 정수 타입으로 산출되어 1이 출력됨
		System.out.println(result4);

		int result5 = a % b;
		System.out.println(result5);

		double result6 = (double) a / b; // 실수 타입의 형변환이 이루어져 실수 타입인 1.66X로 출력됨
		System.out.println(result6);

	}

}
