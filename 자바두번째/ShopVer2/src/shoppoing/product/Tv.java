package shoppoing.product;

public class Tv extends Product{

	public Tv(){		
		// 조상클래스의 생성자 Product(int price)를 호출한다
		super(100);	// Tv의 가격을 100만원으로 한다
	}
	
	public String myProductName() {
		return "Tv";		
	}
	
	
//	public String toString() {	// 원래는 주소값이 나온다// Object 클래스의 toString()을 오버라이딩한다.
//		return "Tv";		
//	}
	
	// 상속과 오버라이딩의 힘 - toString()
	
	
}
