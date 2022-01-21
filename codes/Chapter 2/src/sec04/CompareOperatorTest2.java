package sec04;

public class CompareOperatorTest2 {

	public static void main(String[] args) {

		int a = 1;
		double b = 1.0;
		
		System.out.println(a == b); //true
		
		double c = 0.1;
		float d = 0.1f;
		System.out.println(c == d); //false
		System.out.println((float)c == d); //true
		System.out.println((int)(c*10) == (int)(d*10)); //true

	}

}
