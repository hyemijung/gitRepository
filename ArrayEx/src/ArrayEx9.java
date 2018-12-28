
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		로또 프로그램 만들기

		// 45개의 정수값을 저장하기 위한 배열 생성
		int[] ballArr = new int[45];

		// 배열의 각 요소에 1~45의 값을 저장한다
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;
		}

//		6개의 공을 임의로 뽑는다

		int temp = 0;     // 임시값 (치환할때 썼던것)
		int rndNum = 0;

//		섞는다 셔플
		for (int i = 0; i < 45; i++) {
			rndNum = (int) (Math.random() * 45);
			temp = ballArr[i];   // 치환을 위해 임의의 값을 만든것
			ballArr[i] = ballArr[rndNum];
			ballArr[rndNum] = temp;

		}
		
		System.out.println("자동선택 번호");
		System.out.println("=====================");

		for (int i = 0; i < 6; i++) {
			System.out.println(ballArr[i] + " ");
		}
		
//		45개의 공 확인
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + " ");
//			if ((i + 1) % 5 == 0) {                      // 가독성을 해치지않기 위해(스크롤 없도록해야함)
//				System.out.println();
//			}
//		}

	}
}
