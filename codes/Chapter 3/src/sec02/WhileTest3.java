package sec02;

public class WhileTest3 {

	public static void main(String[] args) throws Exception {

		boolean run = true; // 프로그램 구동 여부
		int speed = 0; // 속도 저장 변수
		int keyCode = 0; // 키보드 입력값 저장 변수

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("-----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.print("선택: ");
			}

			keyCode = System.in.read();

			if (keyCode == 49) { // 1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 50) { // 2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 51) { // 3
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}
}
