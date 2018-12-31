
public class SortExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = new int[5];

		scoreArr[0] = 5;
		scoreArr[1] = 8;
		scoreArr[2] = 2;
		scoreArr[3] = 10;
		scoreArr[4] = 7;

		System.out.println("정렬 전");
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}

		System.out.println();
		System.out.println("내림차순으로 정렬");

//		버블정렬 미완성 //내림차순
		int temp = 0;
		for (int i = 0; i < scoreArr.length; i++) { // i는 횟수
			for (int n = 0; n < scoreArr.length - 1; n++) { 
				if (scoreArr[n] < scoreArr[n + 1]) { // 서로 인접한것 끼리 비교 , n과 n+1
					temp = scoreArr[n];
					scoreArr[n] = scoreArr[n + 1];
					scoreArr[n + 1] = temp;
				}

			}
		}
//		내림차순 후 출력
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
	}

}
