package sec04;

public class AccuracyOperationTest2 {

	public static void main(String[] args) {

		int total = 1;
		int totalInt = total * 10;
		int piece = 7;

		double remain = (totalInt - piece) / 10.0;

		System.out.println("전체에서 " + remain + "만 남음");

	}

}
