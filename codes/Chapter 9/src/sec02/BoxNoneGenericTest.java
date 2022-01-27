package sec02;

public class BoxNoneGenericTest {

	public static void main(String[] args) {
		BoxNoneGeneric box = new BoxNoneGeneric();
		
		box.set("홍길동");
		String name = (String) box.get(); // 불러올 때마다 타입 변환을 해야 함

	}

}
