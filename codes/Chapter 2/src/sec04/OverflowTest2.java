package sec04;

public class OverflowTest2 {

	public static void main(String[] args) {

		int a = 1000000;
		long b = 1000000l; // a�� b �� �ϳ��� long�̾�� ��
		long c = a * b;

		System.out.println(c);

	}

}
