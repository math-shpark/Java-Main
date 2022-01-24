package sec04;

public class SuperAirplaneTest {

	public static void main(String[] args) {

		SuperAirplane sa = new SuperAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
