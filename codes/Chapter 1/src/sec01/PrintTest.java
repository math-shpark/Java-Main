package sec01;

public class PrintTest {
	public static void main(String[] args) {

		System.out.print("Hello World");
		System.out.print("Hello World \n");

		System.out.println("\\");
		System.out.println("'");

		System.out.printf("%d \n", 10); // ����(10)�� 10������ ���
		System.out.printf("%o \n", 10); // ����(10)�� 8������ ���
		System.out.printf("%x \n", 10); // ����(10)�� 16������ ���

		System.out.printf("%4d \n", 10); // 4ĭ Ȯ�� �� �����ʺ��� ����
		System.out.printf("%-4d \n", 10); // 4ĭ Ȯ�� �� ���ʺ��� ����
		System.out.printf("%04d \n", 10); // 4ĭ Ȯ�� �� �����ʺ��� ���� (������� 0)

		System.out.printf("%f \n", 10.1); // �Ǽ�
		System.out.printf("%.2f \n", 10.1); // �Ǽ�(�Ҽ��� ��°�ڸ�����)

		System.out.printf("%s \n", "ȫ�浿"); // ���ڿ�
		System.out.printf("%s�� ���̴� %d �Դϴ�.", "ȫ�浿", 26);

	}

}