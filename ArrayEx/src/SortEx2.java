
public class SortEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = new int[5];

		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}

		System.out.println();
		System.out.println("오름차순으로 정렬");

		
//		버블정렬 미완성
		int temp = 0;
		for (int i = 0; i < scoreArr.length; i++) { // i는 횟수
			for (int n = 0; n < scoreArr.length-1; n++) { // 여기부터 SortEx1과 비교하여 바꿔진 부분(아래)
				if (scoreArr[n] > scoreArr[n + 1]) { // 서로 인접한것 끼리 비교 , n과 n+1
					temp = scoreArr[n];
					scoreArr[n] = scoreArr[n + 1];
					scoreArr[n + 1] = temp;
				}

			}
		}
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
	}

}
