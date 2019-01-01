
public class SortExHomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열 생성과 선언 
		int[][] gugudan = new int[10][10];	

//	2차원 배열 할당 
		for (int i = 2; i < gugudan.length; i++) {
			for (int n = 1; n < gugudan.length; n++) {
				gugudan[i][n] = i * n;
				System.out.print(i + "*" + n + "=" + gugudan[i][n] +"\t");
			}
			
			
		}
		
		
	}

}
