
public class ExceptionEx3_1 {

	public static void main(String[] args) {
		
//		컴파일러가 예외처리를 확인하지 않는
//		RuntimeException 클래스들(자식클래스)은
//		unchecked예외 라고 부르고,
		
//		예외처리를 확인하는 Exception클래스들은
//		checked 예외라고 부른다
		
//		논리오류는 코드짜는 사람의 실수
//		(함수나 식이 잘못되어있는 경우 등)
//		이건 디버깅으로 잡는다
		
		try {
//			Exception e = new Exception("고의로 예외 발생시킴");  //예외 클래스를 하나 만듬
//			throw e;				// 고의로 예외를 발생시키는 throw( e를 throw 함.) - 고의로 예외를 발생시키면 테스트를 해볼수 있다
			
			throw new RuntimeException();   // 예외를 던질때는 보통 이런 형식으로 던진다
		} catch(Exception e){
			
			System.out.println("에러 메시지: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료되었습니다");
	}
}

