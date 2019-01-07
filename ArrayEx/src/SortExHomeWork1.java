
public class SortExHomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		구구단 2차원 배열 생성과 선언 
		//반성 - 행렬[8][9]값만으로 충분한데 더많이 생성함 - 비효율
		int[][] gugudan = new int[10][10];

//	2차원 배열 할당 
		//반성 - 입력과 출력을 따로하지않는 기능의 분리가 이루어지지 않음
		for (int i = 2; i < gugudan.length; i++) {
			for (int n = 1; n < gugudan.length; n++) {
				gugudan[i][n] = i * n;
				System.out.print(i + "*" + n + "=" + gugudan[i][n] + "\t");

				if (n == 9) {
					System.out.println();
				}
			}

		}

	}

}
