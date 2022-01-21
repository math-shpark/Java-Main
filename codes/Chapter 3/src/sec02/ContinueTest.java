package sec02;

public class ContinueTest {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; // 홀수면 출력하지 않고 조건식으로 돌아감
			}
			System.out.println(i);

		}
	}

}
