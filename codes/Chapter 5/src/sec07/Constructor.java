package sec07;

public class Constructor {

	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
	Constructor() {
	}

	Constructor(String model) {
		this.model = model;
	}

	Constructor(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Constructor(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
