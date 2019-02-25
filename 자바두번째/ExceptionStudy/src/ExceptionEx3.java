
public class ExceptionEx3 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 예외 발생시킴");  //예외 클래스를 하나 만듬
			throw e;				// 고의로 예외를 발생시키는 throw( e를 throw 함.) - 고의로 예외를 발생시키면 테스트를 해볼수 있다
		} catch(Exception e){
			
			System.out.println("에러 메시지: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료되었습니다");
	}
}

