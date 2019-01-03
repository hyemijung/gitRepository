
public class ClassEx {

	void instanceMethod() {
		
	}
	
	static void staticMethod() {  // 스태틱 메서드, 클래스 메서드
		
	}
	
	void instanceMethod2() {
		instanceMethod();   // 인스턴스 메서드 호출 
		staticMethod();     // 스태틱 메서드 호출
	}
	
	static void staticMethod2() {
//		instanceMethod();  // 인스턴스 메서드 호출 // 클래스메서드는 인스턴스메서드를 사용할수 없다 //컴파일러 때문에 실행전에도 오류가 뜸
		staticMethod();    // 스태틱 메서드 호출
	}
	
}
