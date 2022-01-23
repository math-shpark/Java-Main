package sec07;

public class ThisConstructorTest {

	public static void main(String[] args) {

		ThisConstructor car1 = new ThisConstructor();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		ThisConstructor car2 = new ThisConstructor("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();

		ThisConstructor car3 = new ThisConstructor("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		ThisConstructor car4 = new ThisConstructor("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);

	}

}
