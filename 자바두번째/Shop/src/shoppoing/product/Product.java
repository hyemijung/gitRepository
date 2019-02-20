package shoppoing.product;

public class Product {

	public int price;	// 제품의 가격
	public int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	
	public Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 보너스 점수는 제품의 가격의 10%
	}
	
	
	
}
