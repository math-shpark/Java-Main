package sec04;

public class PromotionTest1 {

	public static void main(String[] args) {

		// 1. byte���� int�� �ڵ� ����ȯ
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println(intValue);

		// 2. char���� int�� �ڵ� ����ȯ
		char charValue = '��';
		intValue = charValue;
		
		System.out.println("���� �����ڵ�=" + intValue);

		// 3. int���� long���� �ڵ� ����ȯ
		intValue = 500;
		long longValue = intValue;

		System.out.println(longValue);

		// 4. long���� double�� �ڵ� ����ȯ
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}
