
public class ExceptionEx4 {

	public static void main(String[] args) {
		
//		3대 예외처리 (포트를 열어야 접속이 가능하므로 무조건 마지막에 finally로 포트를 닫아야 한다)
//		1. 파일 입출력
//		2. 네트워크(통신에 관련된 전부)
//		3. 컨넥트(DB)
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		} finally {						// 오류가 있던 없던 실행되는 finally
			System.out.println(6);
		}
		
		System.out.println(7);
		
	}
	
}
