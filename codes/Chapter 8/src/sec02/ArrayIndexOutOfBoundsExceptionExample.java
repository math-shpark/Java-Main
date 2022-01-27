package sec02;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		// 현재 메인 메소드의 매개변수인 args 배열에는 데이터가 없는 상태
		// args 배열은 현재 배열 길이가 선언되지 않아 데이터를 추가할 수 없음
		
		String data1 = args[0]; // 에러
		String data2 = args[1]; // 에러
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}
