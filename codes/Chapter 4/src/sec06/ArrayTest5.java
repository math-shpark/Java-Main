package sec06;

public class ArrayTest5 {

	public static void main(String[] args) {

		// ���� ������ ������ 2���� �迭 ����
		int[][] mathScores = new int[2][3];

		// �ݺ����� �̿��Ͽ� �迭 ���� ���
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}

		System.out.println();

		// ���� ������ ������ 2���� �迭 ����
		int[][] englishScores = new int[2][];

		// 1�࿡ ���� 2�� �迭 ����
		englishScores[0] = new int[2];

		// 2�࿡ ���� 3�� �迭 ����
		englishScores[1] = new int[3];

		// �ݺ����� �̿��Ͽ� �迭 ���� ���
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}

		System.out.println();

		// �ڹ� ������ ������ 2���� �迭 ���� �� �� ����
		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };

		// �ݺ����� �̿��Ͽ� �迭 ���� ���
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}

	}

}
