package throwing.test;

public class OtherClass {

//	void method1() throws Exception { // method1()을 부른 애가 오류를 처리해라
//		method2();			
//		
//	}
	
	void method1() {      // 위의것과 주석처리 하면서 비교하라
		
		try {
			method2();	
		} catch(Exception e) {
			System.out.println("throws 가 끝났으니 내가 여기서 해결할께");
		}
			
	}
	
	
	
	
	
	// 메서드 선언부에 예외를 선언함으로써 메서드를 사용하려는 
	//	사람이메서드의 선언부를 보았을 때, 이 메서드를 사용하기 위해서는 
	//	어떠한 예외들이 처리되어야 하는지 쉽게 알수 있다.
	void method2() throws Exception{    // throws 나를 호출하는 애가 오류를 처리해라는 의미 -> method2()가 해결해라(위로올라간다)
		throw new Exception("우리가 오류코드를 만들수 있지");			// throw 예외를 던진다는것
	}
}
