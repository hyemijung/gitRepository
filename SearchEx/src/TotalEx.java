
public class TotalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		누적된 합은 어떻게 구할것인가

//		누적 1 ~ 100 까지의 합

//		int sum = 0;

//		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
//			System.out.println(i + " 까지의 합" + sum);
//		}

//		1~100까지의 수를 더하다가
//		합의 결과가 100을 넘으면 종료하는 프로그램을 만드시오 // 전체의 범위에서 일부분이 되면 if문 사용해야됨을 보여준다
//		출력 결과 : 91
//		선택의 순간에는 if문

		int sum = 0;

		for (int i = 0; i < 100; i++) {
//			78 + 13 = 91
//			91 + 14 = 105
			if (sum + (i + 1) > 100) {              // 테스트(유연성 검사)만 하고있음
				break;                              // 언제든지 반복문 종료! 중요!
			}
			sum = sum + (i + 1);          // 앞에 테스트(검증)를 먼저하고 처리하는것 (순서가 있다 로직 중요하다)

		}

		System.out.println(sum);
	}

}
