package sec04;

public class OverflowTest2 {

	public static void main(String[] args) {

		int a = 1000000;
		long b = 1000000l; // a나 b 중 하나라도 long이어야 함
		long c = a * b;

		System.out.println(c);

	}

}
