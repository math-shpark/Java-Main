package sec08;

public class Car2Test {

	public static void main(String[] args) {

		Car2 myCar = new Car2(); // ��ü ����

		// �޼ҵ� ����
		myCar.keyTurnOn();
		myCar.run();

		// ���ϰ� ����
		int speed = myCar.getSpeed();

		// ��� ���
		System.out.println("���� �ӵ�: " + speed + "km/h");

	}

}
