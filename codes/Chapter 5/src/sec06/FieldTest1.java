package sec06;

public class FieldTest1 {

	public static void main(String[] args) {

		// 객체 생성
		Field myCar = new Field();

		// 필드 값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed); // 값이 설정되어 있지 않아 기본값 0으로 설정됨

		// 필드 값 변경
		myCar.speed = 60;

		// 수정 결과 출력
		System.out.println("수정된 속도: " + myCar.speed);

	}

}
