package sec02;

public class BoxNoneGenericTest {

	public static void main(String[] args) {
		BoxNoneGeneric box = new BoxNoneGeneric();
		
		box.set("ȫ�浿");
		String name = (String) box.get(); // �ҷ��� ������ Ÿ�� ��ȯ�� �ؾ� ��

	}

}
