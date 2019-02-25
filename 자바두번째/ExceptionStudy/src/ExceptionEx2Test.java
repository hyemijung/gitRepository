
public class ExceptionEx2Test {
	public static void main(String[] args) {

//		printStackTrace()
//		예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다
//
//		getMessage()
//		발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
		
//		(실습)
//		null 포인터 예외를 발생시키는데(null이 있는 객체를 마음대로 조작하려할때 발생하는 오류)
//		문제가 발생하였습니다.
		
//		예외 메시지 : 예외 메세지를 출력하시오
//		ex:) 문제가 발생하였습니다. 
//		예외메시지:  / zero
		
		System.out.println(1);
		System.out.println(2);
		
		String str = null;
		
		try {
			System.out.println(3);
			str.charAt(1);			// NullPointerException을 만들어냄
			System.out.println(str);
		}
		
		catch(NullPointerException e) {
			System.out.println("문제가 발생하였습니다");
			System.out.println("예외메시지: " + e.getMessage());
//			e.printStackTrace();
			System.out.println(4);
		}
		
		System.out.println(5);
				
		System.out.println("종료");
		
	}
}
