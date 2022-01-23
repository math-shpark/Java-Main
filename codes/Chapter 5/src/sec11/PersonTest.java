package sec11;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "계백");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

//		p1.nation = "usa"; (x)
//		p1.ssn = "654321-7654321"; (x)
		p1.name = "을지문덕";

	}

}
