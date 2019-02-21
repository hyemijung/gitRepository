package shopping.product;

public class Tv extends Product{

	public Tv() {
		//조상 클래스의 생성자 Product(int price)를 호출한다.
		super(100);
		productName = "Tv";
	}
	
	public Tv(int price, String name) {
		//조상 클래스의 생성자 Product(int price)를 호출한다.
		super(price, name);
	}
	
//	public String toString() { //object클래스의 toString을 오버라이딩 한다.
//		return "Tv";
//	}
	
	
}
