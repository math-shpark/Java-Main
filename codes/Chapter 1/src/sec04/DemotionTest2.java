package sec04;

public class DemotionTest2 {

	public static void main(String[] args) {

		byte b1;
		char c1;
		int i1 = 128;
		int i2 = 97;
		double d1 = 3.14;

		System.out.println("����� ����ȯ�� ���");

		b1 = (byte) i1;
		System.out.println("b1 = (byte) i1�� ����ȯ " + b1);

		c1 = (char) i2;
		System.out.println("c1 = (char) i2�� ����ȯ " + c1);

		i1 = (int) d1;
		System.out.println("i1 = (double) d1�� ����ȯ " + i1);

	}

}
