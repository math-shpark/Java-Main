package sec03;

import java.io.InputStream;

public class SystemInTest2 {
	public static void main(String[] args) throws Exception {

		// 입력스트림 변수
		InputStream is = System.in;

		// 문자열을 저장할 배열(길이 100)
		byte[] datas = new byte[100];

		// 이름 입력할 칸 UI
		System.out.print("이름: ");

		// 입력한 문자를 읽은 문자 개수 반환
		int nameBytes = is.read(datas);

		// 입력한 문자를 String 객체에 저장
		// 개수에서 2개를 뺀 이유 : Enter 키에 해당하는 부분이라 제외
		String name = new String(datas, 0, nameBytes - 2);

		// 하고 싶은 말을 입력할 UI
		System.out.print("하고 싶은말: ");

		// 입력한 문자에 대해 읽은 문자 개수 반환
		int commentBytes = is.read(datas);

		// 입력한 문자를 String 객체에 저장
		String comment = new String(datas, 0, commentBytes - 2);

		// 입력받은 값 출력
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말: " + comment);

	}
}
