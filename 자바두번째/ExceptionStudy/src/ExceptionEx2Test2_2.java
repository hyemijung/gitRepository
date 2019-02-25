import java.util.Scanner;

public class ExceptionEx2Test2_2 {
	public static void main(String[] args) {

//	   사용자의 입력을 받는다
//	   오로지 숫자만
//	   nextInt();
//
//	   문자열 값을 입력하였을때 오류가 없이 프로그램은 수행되어야 한다(현재는 문자를 입력하면 예외메시지와함께 무조건 종료가 된다)

//	  완벽한 프로그램이란 사용자가 원할때 종료되는 것이지 마음대로 종료되어서는 안된다 

//	대승씨 코드(이게 정답) + 샘수정
		System.out.println("어서오세요");
		System.out.println("Welcome to");
		System.out.println("이랏샤이마세");

		System.out.println("무한 숫자 타자 연습");

		int inputNum = -1;
		Scanner scan = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("프로그램을 종료하실려면 -999를 입력해주세요"); // 하나의 트랜젝션 단위이므로 try안에 넣어준것
				if (inputNum == -999) {
					break;
				}

				System.out.println("숫자를 입력하세요");
				inputNum = scan.nextInt();

			} catch (Exception e) {
				// TODO: handle exception

				System.out.println("앗.. 잘못 입력하셨군요.");
				scan.nextLine();    // 무한루프를 벗어나려고 아무런 작동도 안하는 무의미한 코드를 넣으면 벗어날수 있다

			}
		}

		System.out.println("프로그램을 종료합니다");
	}
}