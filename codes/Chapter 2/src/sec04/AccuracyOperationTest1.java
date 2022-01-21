package sec04;

public class AccuracyOperationTest1 {

	public static void main(String[] args) {

		int total = 1;
		double unit = 0.1;
		int piece = 7;
		
		double remain = total - unit * piece;
		
		System.out.println("전체에서 " + remain + "만 남음");
		
	}

}
