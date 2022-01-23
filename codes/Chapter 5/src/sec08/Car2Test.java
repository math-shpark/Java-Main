package sec08;

public class Car2Test {

	public static void main(String[] args) {

		Car2 myCar = new Car2(); // 객체 생성

		// 메소드 실행
		myCar.keyTurnOn();
		myCar.run();

		// 리턴값 저장
		int speed = myCar.getSpeed();

		// 결과 출력
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
