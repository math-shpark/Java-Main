package sec10;

public class Television {

	static String company = "Samsung";
	static String model = "LCD";
	static String info;

	// 정적 초기화 블록
	static {
		info = company + "-" + model;
	}

}
