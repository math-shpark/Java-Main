package sec07;

public class ChildTest {

	public static void main(String[] args) {

		Child child = new Child();

		Parent parent = child;

		parent.method1();

		parent.method2();

	}

}
