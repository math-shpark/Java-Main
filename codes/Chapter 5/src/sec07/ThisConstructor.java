package sec07;

public class ThisConstructor {

	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
	ThisConstructor() {
	}

	ThisConstructor(String model) {
		this(model, null, 0);
	}

	ThisConstructor(String model, String color) {
		this(model, color, 0);
	}

	// �ʱ�ȭ ���� ������
	ThisConstructor(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
