
public class ArrayExTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		초기화
//		score[0] = 1;                 // 배열의 시작값은 0 이다
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
		
//		반복문으로 대체작성하라
		
		int[] score = new int[5];  

		for (int i = 0; i < 5; i++) {
			score[i] = i + 1;
			}

		int cnt = 0;
		while(cnt < 5) {
			System.out.println(score[cnt]);
			
			cnt++;
		}
		
//		System.out.println(score);    // 하면 메모리크기 값이 출력되는것을 확인 -> 인덱스가 필요함
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);

	}

}
