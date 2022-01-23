package sec13;

public class A2 {

	// 필드
	public int field1; // public
	int field2; // default
	private int field3; // private

	// 생성자
	public A2() {
		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();
	}

	// 메소드
	public void method1() {
	} // public

	void method2() {
	} // default

	private void method3() {
	} // private

}
