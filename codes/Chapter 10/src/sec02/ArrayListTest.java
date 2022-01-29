package sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {

		// ArrayList ��ü ����
		List<String> list = new ArrayList<String>();

		// ������ �߰�
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2�� �ε����� ������ �߰�
		list.add("iBATIS");

		// ArrayList�� ����� ��ü ��
		int size = list.size();

		// ��ü �� ���
		System.out.println("�� ��ü��: " + size);

		// �� �� ����
		System.out.println();

		// 2�� �ε����� ����� ��ü ȣ��
		String skill = list.get(2);

		// 2�� �ε����� ����� ��ü ���
		System.out.println("2: " + skill);

		// �� �� ����
		System.out.println();

		// �� �ε����� ����� ��ü ��� �ݺ���
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

		// �� �� ����
		System.out.println();

		// 2�� �ε��� ��ü ����
		list.remove(2);

		// ����� 2�� �ε��� ��ü ����
		list.remove(2);

		// iBATIS ���ڿ� ��ü ����
		list.remove("iBATIS");

		// �ε������� ����� ��ü ��� �ݺ���
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
