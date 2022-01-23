package sec09;

public class Car {

	// 필드
	String model;
	int speed;

	// 생성자
	Car(String model) {
		this.model = model; // 필드 호출
	}

	// 메소드
	void setSpeed(int speed) {
		this.speed = speed; // 필드 호출
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i); // 메소드 호출
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}

}
