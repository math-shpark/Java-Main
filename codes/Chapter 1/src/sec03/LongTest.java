package sec03;

public class LongTest {

	public static void main(String[] args) {

		long var1 = 10;
		long var2 = 20L;
//		long var3 = 100000000000000000; // 컴파일 에러(L을 붙이지 않았기 때문)
		long var4 = 100000000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
