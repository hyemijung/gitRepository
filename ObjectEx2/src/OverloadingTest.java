

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mycalc mc = new Mycalc();

		
		long result = 0;
		int[] numArr = new int[4]; // 배열 몇개를 만들지는 사용자가 결정하는것- 갯수를 바꿔가며 테스트 할수있음
		
//		Scanner scan = new Scanner(System.in);  // 사용자 입력 받는 거 샘꺼 코드 보기
		
		numArr[0] = 100;
		numArr[1] = 200;
		numArr[2] = 300;
		numArr[3] = 400;
		
		result = mc.add(numArr);
		
		System.out.println(result); //출력문을 여기로 뺀 이유 -> 미래에 설계도에서 다바꾸지않고 이곳에서 변경사항을 바꿔 한꺼번에 적용하도록
	}

}
