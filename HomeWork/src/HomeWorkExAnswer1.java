import java.util.Scanner;

public class HomeWorkExAnswer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//사용자로부터 3개의 정수를 입력받아 그중에 가장 큰수를 찾아 출력하는 프로그램을 만드시
//중첩 if문을 사용해서 만들자 

//출력결과
//"첫번째 정수 입력해주세요" 
//첫번쨰 정수 입력 
//"두번째 정수 입력해주세요"
//두번쨰 정수 입력 
//"세번째 정수 입력해주세요"		
//세번째 정수 입력 
//"   값이 제일 크다"

		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.println("첫번째 정수 입력해주세요");
		num1 = scan.nextInt();

		System.out.println("두번째 정수 입력해주세요");
		num2 = scan.nextInt();

		System.out.println("세번째 정수 입력해주세요");
		num3 = scan.nextInt();

		if (num1 > num2) {

			if (num1 > num3) {
				System.out.println(num1 + "값이 제일 크다");
			} else {
				System.out.println(num3 + "값이 제일 크다");
			}
			
			
		} else {

			if (num2 > num3) {
				System.out.println(num2 + "값이 제일 크다");
			}else {
				System.out.println(num3 + "값이 제일 크다");
			}
		}

	}

}
