
public class SortExHomeWork1revised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열 생성과 선언 
		// 반성 - 행렬[8][9]값만으로 충분한데 더많이 생성함 - 비효율
		int[][] gugudan = new int[8][9];

//	2차원 배열 할당 
		// 반성 - 입력과 출력을 따로하지않는 기능의 분리가 이루어지지 않음

//		입력
//		i는 무조건 0 부터!!!
		for (int i = 0; i < gugudan.length; i++) {
			for (int n = 0; n < gugudan[0].length; n++) {  // [0]없이는 8,즉 행의 갯수만큼 범위생성이므로, [0]을 붙여주면 그뒤 열의 갯수만큼 범위가 생성
				gugudan[i][n] = (i + 2) * (n + 1);

			}

		}

//		출력
		for (int i = 0; i < gugudan.length; i++) {
			for (int n = 0; n < gugudan[0].length; n++) {
				System.out.print((i + 2) + "*" + (n + 1) + "=" + gugudan[i][n] + "\t");
								
			}
			System.out.println();
		}

	}

}
