package sec06;

public class ArrayTest8 {

	public static void main(String[] args) {

		// ���� �迭 ����
		String[] oldStrArray = { "java", "array", "copy" };

		// �ٿ� ���� �迭 ����
		String[] newStrArray = new String[5];

		// �����ϴ� �޼ҵ� ����
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		// ��� ���
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}

	}

}
