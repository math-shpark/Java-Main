package sec04;

public class OverflowTest1 {

	public static void main(String[] args) {

		int a = 1000000;
		int b = 1000000;
		int c = a * b; // 컴파일 에러는 나지 않지만 쓰레기값 출력

		System.out.println(c);

	}

}
