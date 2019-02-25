package throwing.test;

public class ExceptionEx4 {

//	예외를 처리하는 방법
//	1. try-catch
//
//	2. throws
//	[표현식]
//	반환타입 메서드명() throws Exception1, Exception2, ...
//	ExceptionN {
//		// 메서드 내용
//	}
	
//	예외를 메서드의 throws에 명시하는 것은
//	예외를 처리하는 것이 아니라,
//	자신(예외가 발생할 가능성이 있는 메서드)를
//	호출한 메서드에게 예외를 전달하는 예외처리를 떠맡기는 것이다
	
	
//	public static void main(String[] args) throws Exception {  // 계속 오류해결을 throws로 다른것에 넘겨서 오류가 생겼음
		public static void main(String[] args) {
		
		OtherClass oc = new OtherClass();
	
		oc.method1();
		
//		try {										// 오류해결을 여기서 try-catch로 해결하자! 
//			oc.method1();						//OtherClass에서 오류를 해결해서 이게 의미가 없어짐
//		} catch (Exception e) {
//			System.out.println("고생했어 여기서 끝내자");
//			e.printStackTrace();
//		}
		
		try {										// 오류해결을 여기서 try-catch로 해결하자! 
			oc.method2();						//OtherClass에서 오류를 해결해서 이게 의미가 없어짐
		} catch (Exception e) {
			System.out.println(" 여기서 끝내자");
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
