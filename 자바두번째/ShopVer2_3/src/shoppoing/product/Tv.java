package shoppoing.product;

public class Tv extends Product{

	public Tv(){		
//		super(100) // 보통 기본생성자는 건들지 않는 것이 좋다. 
//		기본적으로 티비를 만들면 100만원으로 하자는 것 		
	}
	
	public Tv(String name) {
		super(name);
	}
	
	public Tv(String name, int price) {
		super(name, price);
	}
	
	public String myProductName() {
		return "Tv";		
	}
	

	
	
}
