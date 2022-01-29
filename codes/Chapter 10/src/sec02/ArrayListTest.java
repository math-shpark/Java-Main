package sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {

		// ArrayList 객체 생성
		List<String> list = new ArrayList<String>();

		// 데이터 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 인덱스에 데이터 추가
		list.add("iBATIS");

		// ArrayList에 저장된 객체 수
		int size = list.size();

		// 객체 수 출력
		System.out.println("총 객체수: " + size);

		// 한 줄 간격
		System.out.println();

		// 2번 인덱스에 저장된 객체 호출
		String skill = list.get(2);

		// 2번 인덱스에 저장된 객체 출력
		System.out.println("2: " + skill);

		// 한 줄 간격
		System.out.println();

		// 각 인덱스에 저장된 객체 출력 반복문
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

		// 한 줄 간격
		System.out.println();

		// 2번 인덱스 객체 삭제
		list.remove(2);

		// 당겨진 2번 인덱스 객체 삭제
		list.remove(2);

		// iBATIS 문자열 객체 삭제
		list.remove("iBATIS");

		// 인덱스별로 저장된 객체 출력 반복문
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
