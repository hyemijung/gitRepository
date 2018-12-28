
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      복사 
//		샘코드 다운받을것 - 내 사고방식과 비교

		int[] fiveNumArr = new int[5];   // 5개의 숫자를 담을 수 있는 배열
		int[] tenNumArr = new int[10];   // 10개의 숫자를 담을 수 있는 배열 

		fiveNumArr[0] = 2;
		tenNumArr[0] = fiveNumArr[0];
		fiveNumArr[1] = 20;
		tenNumArr[1] = fiveNumArr[1];
		fiveNumArr[2] = 12;
		tenNumArr[2] = fiveNumArr[2];
		fiveNumArr[3] = 13;
		tenNumArr[3] = fiveNumArr[3];
		fiveNumArr[4] = 2;
		tenNumArr[4] = fiveNumArr[4];
		tenNumArr[5] = 5;
		tenNumArr[6] = 6;
		tenNumArr[7] = 7;
		tenNumArr[8] = 8;
		tenNumArr[9] = 9;

		for (int i = 0; i < fiveNumArr.length; i++) {
			fiveNumArr[i] = i;

			System.out.println("배열 5개의 " + i + " 번째 값 " + fiveNumArr[i]);
		}

		System.out.println("==========================");
		
		for (int i = 0; i < tenNumArr.length; i++) {
			tenNumArr[i] = i;
			
			System.out.println("배열 10개의 " + i + " 번째 값 " + tenNumArr[i]);
		}

	}
}
