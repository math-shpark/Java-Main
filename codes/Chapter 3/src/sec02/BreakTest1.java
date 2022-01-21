package sec02;

public class BreakTest1 {

	public static void main(String[] args) {

		while (true) {
			int num = (int) (Math.random() * 6) + 1; // 랜덤 숫자 가져오기

			System.out.println(num); // 랜덤 숫자 출력

			// 랜덤 숫자가 6이면 반복문 종료
			if (num == 6) {
				break;
			}
		}

		System.out.println("프로그램 종료");

	}

}
