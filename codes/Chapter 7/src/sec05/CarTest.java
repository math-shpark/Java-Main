package sec05;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();

		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		myCar.run();
	}
}
