
public class ArrayEx12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열

//		int[][] num = {{10, 2}, {1,2}};

		int[][] score = { 
				{ 100, 100, 100 }, // 1행
				{ 20, 20, 20 }, // 2행
				{ 30, 30, 30 }, // 3행
				{ 40, 40, 40 }, // 4행
				{ 50, 50, 50 }, // 5행
		};

		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("[" + score[i][n] + "]");
			}
			System.out.println();
		}

	}
}
