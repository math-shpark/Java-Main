package sec02;

public class BreakTest2 {

	public static void main(String[] args) {

		// �ٱ��� �ݺ����� Outter ��� �� ����
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				
				System.out.println(upper + "-" + lower);
				
				if (lower == 'g') {
					break Outter; // ������ �ݺ��� �󺧸��� ����
				}
				
			}
		}
		System.out.println("���α׷� ���� ����");

	}
}
