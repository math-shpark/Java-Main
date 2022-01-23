package sec11;

public class Person {

	// final 필드
	final String nation = "Korea";
	final String ssn;

	// 인스턴스 필드
	String name;

	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
