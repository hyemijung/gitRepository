package shoppoing.product;

public class Tv extends Product{

	
	
	public Tv(String name, int price){		
		super(name, price);
	}
	
	public String myProductName() {
		return "Tv";		
	}
	
	
//	public String toString() {	// 원래는 주소값이 나온다// Object 클래스의 toString()을 오버라이딩한다.
//		return "Tv";		
//	}
	
	// 상속과 오버라이딩의 힘 - toString()
	
	
}
