package sec07;

public class Child2Test {

	public static void main(String[] args) {

		Parent2 parent = new Child2();

		parent.field1 = "data1";

		parent.method1();
		parent.method2();

		/*
		 * parent.field2 = "data2"; //(불가능)
		 * parent.method3(); //(불가능)
		 */

		Child2 child = (Child2) parent;
		child.field2 = "yyy"; // (가능)
		child.method3(); // (가능)

	}

}
