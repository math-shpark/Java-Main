package sec05;

public class StringTest {

	public static void main(String[] args) {

		String name1 = "ȫ�浿";
		String name2 = "ȫ�浿"; // name1�� name2�� ���� ��ü ����

		// ���� ��ü�� �����ϴ��� �Ǻ�
		if (name1 == name2) {
			System.out.println("name1�� name2�� ���� ��ü ����");
		} else {
			System.out.println("name1�� name2�� �ٸ� ��ü ����");
		}

		// ���ڿ� ������ ������ �Ǻ�
		if (name1.equals(name2)) {
			System.out.println("name1�� name2�� ������ ����");
		} else {
			System.out.println("name1�� name2�� ������ �ٸ�");
		}

		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿"); // name3�� name4�� ������ ��ü�� �����Ͽ� ����

		// ���� ��ü�� �����ϴ��� �Ǻ�
		if (name3 == name4) {
			System.out.println("name3�� name4�� ���� ��ü ����");
		} else {
			System.out.println("name3�� name4�� �ٸ� ��ü ����");
		}

		// ���ڿ� ������ ������ �Ǻ�
		if (name3.equals(name4)) {
			System.out.println("name3�� name4�� ������ ����");
		} else {
			System.out.println("name3�� name4�� ������ �ٸ�");
		}

	}

}
