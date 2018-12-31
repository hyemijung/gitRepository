
public class ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열

//		int형 타입 4행 3열의 2차원 배열을 생성한다

//		초기화 방식
//충접 for문 출력이 가능하면 충첩 for문 입력도 가능하다
		int[][] scoreArr = new int[4][3];
//규칙없이 값을 넣을땐 중첩 for문을 쓰지않고 스캔을 쓰는것이다
		
		System.out.println(scoreArr.length);
		System.out.println(scoreArr[0]); // 배열의 주소값

		int cnt = 1;

		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr[0].length; n++) { // scoreArr[0].length: 0번째 행에서의 열의 갯수 //행부터 찾아가서 열의 갯수를 세는것
				scoreArr[i][n] = cnt++; //
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("[" + scoreArr[i][n] + "] "); // 열이니깐 줄 안바꿈
			}
			System.out.println(); // 행이니깐 줄바꿈
		}

	}
}
