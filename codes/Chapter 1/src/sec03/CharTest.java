package sec03;

public class CharTest {

	public static void main(String[] args) {
		char c1 = 'A'; // ���ڸ� ���� ����
		char c2 = 65; // 10������ ����
		char c3 = '\u0041'; // 16������ ����
		
		char d1 = '��';
		char d2 = 44032;
		char d3 = '\uac00';
		
		int uniCode = c1; // �����ڵ� ���
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println(uniCode);
	}

}
