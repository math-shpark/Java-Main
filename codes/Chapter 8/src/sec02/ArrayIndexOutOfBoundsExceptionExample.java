package sec02;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		// ���� ���� �޼ҵ��� �Ű������� args �迭���� �����Ͱ� ���� ����
		// args �迭�� ���� �迭 ���̰� ������� �ʾ� �����͸� �߰��� �� ����
		
		String data1 = args[0]; // ����
		String data2 = args[1]; // ����
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}
