package sec03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {
	public static void main(String[] args) {

		// HashSet ��ü ����
		Set<String> set = new HashSet<String>();

		// ������ �߰�
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		// ����� ��ü �� ����
		int size = set.size();

		// ����� ��ü �� ���
		System.out.println("�� ��ü��: " + size);

		// iterator �޼ҵ� ȣ��
		Iterator<String> iterator = set.iterator();

		// ��ü�� ������ ����ϴ� �ݺ���
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// �ش� ��ü ����
		set.remove("JDBC");
		set.remove("iBATIS");

		// ���� �� ��ü �� ���
		System.out.println("�� ��ü��: " + set.size());

		// ��ü ���
		for (String element : set) {
			System.out.println("\t" + element);
		}

		// ������ ��ü ����
		set.clear();

		// HashSet�� ����ִ��� Ȯ��
		if (set.isEmpty()) {
			System.out.println("��� ����");
		}
	}
}
