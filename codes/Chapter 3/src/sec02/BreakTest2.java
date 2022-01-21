package sec02;

public class BreakTest2 {

	public static void main(String[] args) {

		// 바깥쪽 반복문에 Outter 라는 라벨 붙임
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				
				System.out.println(upper + "-" + lower);
				
				if (lower == 'g') {
					break Outter; // 종료할 반복문 라벨명을 붙임
				}
				
			}
		}
		System.out.println("프로그램 실행 종료");

	}
}
