package sec07;

public class Constructor {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
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
