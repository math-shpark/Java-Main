package sec08;

public class Computer2Test {

	public static void main(String[] args) {

		Computer2 myCalcu = new Computer2();

		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);

		// ���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);

		// ��� ���
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);

	}

}
