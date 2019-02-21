package shoppoing.product;

public class Product {

	//자식들의 공통된 특성을 관리한다
	public int price;	// 제품의 가격
	public int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	public String productName = ""; // 제품의 이름 // 
	
	public Product() {
		
	}
		
//	public Product(int price){
//		this.price = price;
//		bonusPoint = (int)(price / 10.0); // 보너스 점수는 제품의 가격의 10%
//	}
	
	public Product(String name, int price) {
		this.productName = name;
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	
	public String myProductName() { //추가함!
//				(이후 자식의 오버라이딩된 메서드에 접근하려면 부모도 같은 이름의 메서드를 가져야하기 때문에)
		return "제품";
	}
	
}
