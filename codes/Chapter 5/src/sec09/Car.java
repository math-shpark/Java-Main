package sec09;

public class Car {

	// �ʵ�
	String model;
	int speed;

	// ������
	Car(String model) {
		this.model = model; // �ʵ� ȣ��
	}

	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed; // �ʵ� ȣ��
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i); // �޼ҵ� ȣ��
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	}

}
