
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      복사 
//		다못적음 샘코드 가져올것
		int[] numArr = new int[5];
		int[] backUpNumArr = new int[5];

		int num = 0;
		int backUpNum = 0;

		num = 1;
		backUpNum = num;
		System.out.println("원본 데이터:" + num);
		System.out.println("백업 데이터:" + backUpNum);

		System.out.println("==========================");
		
		numArr[0] = 10;
		backUpNumArr = numArr;

		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본 데이터:" + numArr[i]);
		}

		System.out.println("==========================");
		for(int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("백업 데이터:" +  backUpNumArr[i]);
		}
		

	}
}
