package sec13;

public class A {

	// �ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");

	// ������
	public A(boolean b) {
	} // public

	A(int b) {
	} // default

	private A(String s) {
	} // private
}