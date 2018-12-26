import java.util.Scanner;

public class ForFlowExTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String result = "";
		int num = 0;
		System.out.println("홀짝 게임 시작");

		for (int i = 1; i <= 3; i++) {
			
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				result = "짝수";
			} else {
				result = "홀수";
			}
			System.out.println(num + "는" + result + "입니다");
			System.out.println();

			
//		내가 잘못 한것
//		for ( int i = 0; i >= 0; i++ ) {
//			num = i % 2;
//					System.out.println(num "은  );
//		}
		}
	}
}
