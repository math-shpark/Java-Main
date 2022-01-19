package sec03;

public class CharTest {

	public static void main(String[] args) {
		char c1 = 'A'; // 문자를 직접 저장
		char c2 = 65; // 10진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		
		char d1 = '가';
		char d2 = 44032;
		char d3 = '\uac00';
		
		int uniCode = c1; // 유니코드 계산
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println(uniCode);
	}

}
