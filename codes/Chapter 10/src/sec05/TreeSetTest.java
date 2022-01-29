package sec05;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {

		// TreeSet ��ü ����
		TreeSet<Integer> scores = new TreeSet<Integer>();

		// ������ �߰�
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		// ������ ������ ���� ����
		Integer score = null;

		// ���� ���� ��ü
		score = scores.first();
		System.out.println("���� ���� ����: " + score);

		// ���� ���� ��ü
		score = scores.last();
		System.out.println("���� ���� ����: " + score + "\n");

		// 95 �ٷ� �Ʒ� ��ü
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ� ����: " + score);

		// 95 �ٷ� �� ��ü
		score = scores.higher(new Integer(95));
		System.out.println("95�� ���� ����: " + score + "\n");

		// 95�� ������ ��ȯ�ϰ� ������ �ٷ� �Ʒ� ��ü ��ȯ
		score = scores.floor(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + score);

		// 85�� ������ ��ȯ�ϰ� ������ �ٷ� �� ��ü ��ȯ
		score = scores.ceiling(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ����: " + score + "\n");

		// ���� ���� ��ü�� �����ϴ� �޼ҵ带 �ݺ��Ͽ� ��ü ���� �����ϴ� �ݺ���
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(���� ��ü ��: " + scores.size() + ")");
		}
	}
}
