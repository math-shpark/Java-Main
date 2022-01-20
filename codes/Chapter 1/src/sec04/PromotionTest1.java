package sec04;

public class PromotionTest1 {

	public static void main(String[] args) {

		// 1. byte에서 int로 자동 형변환
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println(intValue);

		// 2. char에서 int로 자동 형변환
		char charValue = '가';
		intValue = charValue;
		
		System.out.println("가의 유니코드=" + intValue);

		// 3. int에서 long으로 자동 형변환
		intValue = 500;
		long longValue = intValue;

		System.out.println(longValue);

		// 4. long에서 double로 자동 형변환
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}
