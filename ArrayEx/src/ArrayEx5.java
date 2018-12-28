
public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      복사 

		
		int[] numArr = new int[5];
		int[] backUpNumArr = new int[5];

		numArr[0] = 10;
		backUpNumArr[0] = numArr[0]; 
		numArr[1] = 20;
		backUpNumArr[1] = numArr[1]; 
		

		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본 데이터: " + numArr[i]);
		}

		System.out.println("======================================");
		for (int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("백업 데이터: " + backUpNumArr[i]);
		}

		numArr[0] = 30;
		backUpNumArr[1] = 40;

		System.out.println("원본 수정 후======================================");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본 데이터: " + numArr[i]);
		}

		System.out.println("======================================");
		for (int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("백업 데이터: " + backUpNumArr[i]);
		}


	}
}
