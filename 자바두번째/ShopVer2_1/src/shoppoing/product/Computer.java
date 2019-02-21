package shoppoing.product;

public class Computer extends Product{
	

	
	public Computer(){		// 생성자
		super(200);
	}
	
	public Computer(int price, String name) {
		super(price, name);
	}
	
	public String myProductName() {
		return "Computer";
	}
	
	
//	public String toString() {
//		return "Computer";		
//	}
	
	
	
	
}
