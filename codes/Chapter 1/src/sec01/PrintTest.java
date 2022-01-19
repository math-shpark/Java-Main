package sec01;

public class PrintTest {
	public static void main(String[] args) {

		System.out.print("Hello World");
		System.out.print("Hello World \n");

		System.out.println("\\");
		System.out.println("'");

		System.out.printf("%d \n", 10); // 정수(10)를 10진수로 출력
		System.out.printf("%o \n", 10); // 정수(10)를 8진수로 출력
		System.out.printf("%x \n", 10); // 정수(10)를 16진수로 출력

		System.out.printf("%4d \n", 10); // 4칸 확보 후 오른쪽부터 차지
		System.out.printf("%-4d \n", 10); // 4칸 확보 후 왼쪽부터 차지
		System.out.printf("%04d \n", 10); // 4칸 확보 후 오른쪽부터 차지 (빈공간은 0)

		System.out.printf("%f \n", 10.1); // 실수
		System.out.printf("%.2f \n", 10.1); // 실수(소수점 둘째자리까지)

		System.out.printf("%s \n", "홍길동"); // 문자열
		System.out.printf("%s의 나이는 %d 입니다.", "홍길동", 26);

	}

}