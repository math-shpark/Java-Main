package sec03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {
	public static void main(String[] args) {

		// HashSet 객체 생성
		Set<String> set = new HashSet<String>();

		// 데이터 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		// 저장된 객체 수 대입
		int size = set.size();

		// 저장된 객체 수 출력
		System.out.println("총 객체수: " + size);

		// iterator 메소드 호출
		Iterator<String> iterator = set.iterator();

		// 객체가 있으면 출력하는 반복문
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// 해당 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");

		// 삭제 후 객체 수 출력
		System.out.println("총 객체수: " + set.size());

		// 객체 출력
		for (String element : set) {
			System.out.println("\t" + element);
		}

		// 데이터 전체 삭제
		set.clear();

		// HashSet이 비어있는지 확인
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
