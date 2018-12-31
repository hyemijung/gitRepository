
public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열

//		int형 타입 4행 3열의 2차원 배열을 생성한다

		int[][] scoreArr = new int[4][3];

		scoreArr[0][0] = 1;
		scoreArr[3][2] = 12;

//		System.out.println(scoreArr[0][0]);
//		System.out.println(scoreArr[0][1]);
//		System.out.println(scoreArr[0][2]);
		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("[" + scoreArr[0][i] + "] ");
//		}
//		
//		System.out.println(scoreArr[1][0]);
//		System.out.println(scoreArr[1][1]);
//		System.out.println(scoreArr[1][2]);
//		
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print("[" + scoreArr[1][i] + "] ");
//		}
//		System.out.println(scoreArr[2][0]);
//		System.out.println(scoreArr[2][1]);
//		System.out.println(scoreArr[2][2]);
//		
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print("[" + scoreArr[2][i] + "] ");
//		}

		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("[" + scoreArr[i][n] + "] "); // 열이니깐 줄 안바꿈
			}
			System.out.println(); // 행이니깐 줄바꿈
		}
		
	}
}
