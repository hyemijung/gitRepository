import java.util.Scanner;

public class ExceptionEx2 {
	public static void main(String[] args) {

		
//		예외처리
//		정의 - 프로그램 실행시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
//		목적 - 프로그램의 비정상 종료를 막고,
//			   정상적인 실행상태를 유지하는 것
		
//		@ try블럭 내에서 예외가 발생한 경우,
//		1. 발생한 예외와 일치하는 catch블럭이 있는지 확인한다.
//		2. 일치하는 catch블럭을 찾게되면, 그 catch 블럭 내의 문장들을 수행하고 전체  try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다.
//		만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못한다.
//
//		@ try블럭 내에서 예외가 발생하지 않는 경우
//		1. catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.
		
		
//		@ 필요하다면 구체적인 예외처리를 하나하나 사용하고(어떤 예외인지를 정확히 알아서 그에 맞는 catch문을 만들어야할때)
//		 	그게 아니라면 조상인 Exception으로 한방에 처리해도 좋다
		
//		@ Exception 이 제일 먼저 나온다면 다른 구체적 예외들의 부모이므로 예외를 다 잡아 버린다. 
//		그러므로 이 이후에 적는 catch의 예외들은 다처리된 상태로, 있어도 필요가 없다
		
//		@ printStackTrace()
//		예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다
//
//		@ getMessage()
//		발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
		
		System.out.println(1);
		System.out.println(2);
		
		String[] strArr = new String[2];
		strArr[0] = null;
		

		try {
			strArr[0].charAt(1);   // null 포인트 Exception 만들어냄
			System.out.println(3);
//			strArr[2] = "sdf";
			System.out.println(0/0);		// 오류가 발생하는 순간 그뒤의 수행은 다 건너뛰고 catch문이 실행된다
			System.out.println(4);
		} 
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());  // 오류가 어떤 오류인지 보여준다(문자열 형태로 오류를 보여줌)
			e.printStackTrace();    // 오류가 어떤 오류인지 보여준다 (어디에 발생했는지 알수있음)
			System.out.println(5);
			System.out.println("ArithmeticException");
		}

		catch(IndexOutOfBoundsException e) {    // 이걸로하면 ArithmeticException 오류 그대로 발생한다
			System.out.println(6);
			System.out.println("IndexOutOfBoundsException");
			
		}
		

		catch (Exception e) {		// 모든 Exception의 조상- 이걸로 모든 예외들을 다 처리할수 있다(다만 무엇때문에 오류가 발생했는지 알수 없는 모호함이 있다)
			System.out.println(e.getMessage());  
			e.printStackTrace();  
			System.out.println(7); 
			System.out.println("Exception");		// 오류가 발생하지 않으면 catch문은 실행이 안된다 
			 		
		}
		
		System.out.println(8);

	}

}
