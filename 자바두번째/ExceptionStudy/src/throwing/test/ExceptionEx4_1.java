package throwing.test;

public class ExceptionEx4_1 {

//	예외를 처리하는 방법
//	1. try-catch
//
//	2. throws
//	[표현식]
//	반환타입 메서드명() throws Exception1, Exception2, ...
//	ExceptionN {
//		// 메서드 내용
//	}
	
	
	
	public static void main(String[] args) throws Exception {  // Object에 던져서 해결 //계속 오류해결을 throws로 다른것에 넘겨서 오류가 생겼음
//		public static void main(String[] args) {
		
		OtherClass2 oc = new OtherClass2();
	
		oc.method1();
		
//		try {										// 오류해결을 여기서 try-catch로 해결하자! 
//			oc.method1();						//OtherClass에서 오류를 해결해서 이게 의미가 없어짐
//		} catch (Exception e) {
//			System.out.println("고생했어 여기서 끝내자");
//			e.printStackTrace();
//		}
		
		try {										
			oc.method2();						
		} catch (Exception e) {
			System.out.println(" 여기서 끝내자");
//			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
