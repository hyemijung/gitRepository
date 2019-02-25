import java.util.Scanner;

public class ExceptionEx2Test2 {
	public static void main(String[] args) {

//	   사용자의 입력을 받는다
//	   오로지 숫자만
//	   nextInt();
//
//	   문자열 값을 입력하였을때 오류가 없이 프로그램은 수행되어야 한다(현재는 문자를 입력하면 예외메시지와함께 무조건 종료가 된다)

//	  완벽한 프로그램이란 사용자가 원할때 종료되는 것이지 마음대로 종료되어서는 안된다 

		
		//잘못된 내방법
		System.out.println("어서오세요");
		System.out.println("Welcome to");
		System.out.println("이랏샤이마세");
		System.out.println("무한 숫자 타자 연습");

		Scanner scan = new Scanner(System.in);
		int inputNum = 0;

		while (true) {

			try {
				if (inputNum == -999) {
					break;
				}

				System.out.println("숫자를 입력하세요");
				inputNum = scan.nextInt();

			}

			catch (Exception e) {

				System.out.println("숫자만 입력하여 주세요");
//				break;
			}

			System.out.println("숫자 타자 연습을 계속하고 싶으시면 숫자를 입력하세요");
			System.out.println("프로그램을 종료하고 싶으실땐 -999를 입력해주세요");
		}

		System.out.println("프로그램을 종료합니다");

	}
}