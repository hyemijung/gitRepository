package shoppoing.product;

public class Product {

	protected String name;
	protected int price;	// 제품의 가격
	protected int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	

	public void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
		
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public String toString() {
		String str = "";
		
		str += name + "\n";
		str += price + "\n";
		str += bonusPoint + "\n";
//		str += addProduct;   // 불가능 자식의 특징 다보여주고싶은면 자식클래스에서 toString을 오버라이드해야함
				
		return str;
	}
	
}
