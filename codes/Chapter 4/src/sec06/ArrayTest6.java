package sec06;

public class ArrayTest6 {

	public static void main(String[] args) {

		// �迭 ��ü ����
		String[] strArray = new String[3];

		// �ε����� ��ü ����
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]); // ���� ��ü�� �����ϹǷ� true
		System.out.println(strArray[0] == strArray[2]); // �ٸ� ��ü�� �����ϹǷ� false
		System.out.println(strArray[0].equals(strArray[2])); // ���ڿ��� �����Ƿ� true

	}

}
