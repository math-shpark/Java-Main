package sec06;

public class FieldTest1 {

	public static void main(String[] args) {

		// ��ü ����
		Field myCar = new Field();

		// �ʵ� �� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed); // ���� �����Ǿ� ���� �ʾ� �⺻�� 0���� ������

		// �ʵ� �� ����
		myCar.speed = 60;

		// ���� ��� ���
		System.out.println("������ �ӵ�: " + myCar.speed);

	}

}
