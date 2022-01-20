package sec03;

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		
		// int num = 2147483648; // 표현 범위를 초과한 값으로 컴파일 시 오류 발생

		int num1 = 2147483647;
		int num2 = 1;

		int num3 = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3); // 더한 결과가 범위를 초과하기 때문에 전혀 다른 연산 결과 값이 출력됨
		
	}

}
