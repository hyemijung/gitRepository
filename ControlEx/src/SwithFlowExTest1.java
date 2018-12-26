import java.util.Scanner;

public class SwithFlowExTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		int month = 0;	
		
		System.out.println("1~12달 중 숫자를 입력하세요");
		month = scan.nextInt();
		
		switch (month) {
		case 1: case 2: case 12:    // switch문의 출력결과가 같은경우는 한 라인에 값을 적어줘도 된다
			System.out.println(month + "월은 겨울입니다");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println(month + "월은 여름입니다");
			break;
		case 10: case 11:
			System.out.println(month + "월은 가을입니다");
			break;
		default:
			System.out.println("error");  // 12보다 큰수를 넣었을 경우를 처리하기위해서
			break;
		}

	}

}
