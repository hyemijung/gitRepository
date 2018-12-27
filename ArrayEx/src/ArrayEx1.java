
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열 Array [] 
		
//		5개 int 값을 저장할 수 있는 배열을 생성한다
		int[] score = new int[5];  // 복수
//		String[] str =         // string도 이런식으로 선언한다
				
//		int scoreNum = 0;
//		int scoreNum2 = 0;
//		int scoreNum3 = 0;
				
		
		
//		초기화
		score[0] = 1;                 // 배열의 시작값은 0 이다
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		
		
		System.out.println(score);    // 하면 메모리크기 값이 출력되는것을 확인 -> 인덱스가 필요함
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
				
	
	}

}
