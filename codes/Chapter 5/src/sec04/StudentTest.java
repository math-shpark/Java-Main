package sec04;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println("s1 객체의 주소값 : " + s1);

		System.out.println();

		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println("s2 객체의 주소값 : " + s2);

	}

}
