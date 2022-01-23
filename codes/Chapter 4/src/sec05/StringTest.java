package sec05;

public class StringTest {

	public static void main(String[] args) {

		String name1 = "홍길동";
		String name2 = "홍길동"; // name1과 name2는 같은 객체 참조

		// 같은 객체를 참조하는지 판별
		if (name1 == name2) {
			System.out.println("name1과 name2는 같은 객체 참조");
		} else {
			System.out.println("name1과 name2는 다른 객체 참조");
		}

		// 문자열 내용이 같은지 판별
		if (name1.equals(name2)) {
			System.out.println("name1과 name2의 내용이 같음");
		} else {
			System.out.println("name1과 name2의 내용이 다름");
		}

		String name3 = new String("홍길동");
		String name4 = new String("홍길동"); // name3과 name4는 각자의 객체를 생성하여 참조

		// 같은 객체를 참조하는지 판별
		if (name3 == name4) {
			System.out.println("name3과 name4는 같은 객체 참조");
		} else {
			System.out.println("name3과 name4는 다른 객체 참조");
		}

		// 문자열 내용이 같은지 판별
		if (name3.equals(name4)) {
			System.out.println("name3과 name4의 내용이 같음");
		} else {
			System.out.println("name3과 name4의 내용이 다름");
		}

	}

}
