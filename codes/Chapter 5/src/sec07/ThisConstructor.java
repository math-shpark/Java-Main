package sec07;

public class ThisConstructor {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	ThisConstructor() {
	}

	ThisConstructor(String model) {
		this(model, null, 0);
	}

	ThisConstructor(String model, String color) {
		this(model, color, 0);
	}

	// 초기화 집중 생성자
	ThisConstructor(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
