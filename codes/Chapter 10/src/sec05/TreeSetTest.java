package sec05;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {

		// TreeSet 객체 생성
		TreeSet<Integer> scores = new TreeSet<Integer>();

		// 데이터 추가
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		// 점수를 저장할 변수 선언
		Integer score = null;

		// 가장 낮은 객체
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);

		// 가장 높은 객체
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");

		// 95 바로 아래 객체
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);

		// 95 바로 위 객체
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score + "\n");

		// 95가 있으면 반환하고 없으면 바로 아래 객체 반환
		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수: " + score);

		// 85가 있으면 반환하고 없으면 바로 위 객체 반환
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");

		// 제일 낮은 객체를 제거하는 메소드를 반복하여 객체 전부 삭제하는 반복문
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}
}
