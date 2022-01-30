package sec04;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) throws Exception {

		// 디렉토리 객체
		File dir = new File("C:/Temp/Dir");
		// 파일 객체들
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));

		// 존재하지 않는 디렉토리면 생성
		if (dir.exists() == false) {
			dir.mkdirs();
		}

		// 존재하지 않는 파일이면 생성
		if (file1.exists() == false) {
			file1.createNewFile();
		}

		if (file2.exists() == false) {
			file2.createNewFile();
		}

		if (file3.exists() == false) {
			file3.createNewFile();
		}

		// 파일 경로
		File temp = new File("C:/Temp");

		// 날짜 형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");

		// 파일 및 디렉토리 목록을 배열에 저장한 후 반환
		File[] contents = temp.listFiles();

		// 결과 출력
		System.out.println("날짜              시간         형태       크기    이름");
		System.out.println("-------------------------------------------------------------------");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}

	}
}
