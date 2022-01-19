package sec02;

public class VariableScopeTest1 {

	public static void main(String[] args) {
		int v1 = 15;
		
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		
//		int v3 = v1 + v2 + 5; // v2 변수는 if 내에서만 사용 가능하기 때문에 에러 발생
	}

}
