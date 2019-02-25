import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {

//		int;    // 컴파일 에러
//		System.out.println(5/0);   // 논리적 에러 // 0으로 값을 나눌수없다(수학적 오류)

		
//		try{
//			  //예외가 발생할 가능성이 있는 문장들을 넣는다
//			}catch (Exception e1){
//			  // Exception1 이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
//			}catch (Exception e2){
//			  // Exception2 이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
//			}...
//			}catch (Exception n){
//			  // ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
//			}
//
//			catch는 수백, 수천개
//			하나하나하나 다 처리가능 하다.
		
		int num = 0;		
		int module = 0;		
		int resultNum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
		
		scan.nextLine();		// 이게 없으면 오류가 뜸.-이전의 값이 기억에 남아있음 그래서 
		int[] numArr = new int[1];
		
		System.out.println("나눌 값을 입력해주세요");		
		module = Integer.parseInt(scan.nextLine());
//		예외처리
		try {
			resultNum = num / module;
			numArr[2] = 1;
		} 	catch (ArrayIndexOutOfBoundsException e) {   
			System.out.println("배열 접근 오류가 발생해서 예외처리함");  // 이안의 내용이 오류가 발생했을때 작동할 작없을 적는다
		}	catch (ArithmeticException e) {   
			System.out.println("산술연산(논리적인) 오류가 발생해서 예외처리함");  // 이안의 내용이 오류가 발생했을때 작동할 작없을 적는다
		}  
		
		
		System.out.println("결과값: " + resultNum);
		
		
		
	}

}
