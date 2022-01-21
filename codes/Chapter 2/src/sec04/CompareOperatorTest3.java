package sec04;

public class CompareOperatorTest3 {

	public static void main(String[] args) {

		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println("");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
	}

}
