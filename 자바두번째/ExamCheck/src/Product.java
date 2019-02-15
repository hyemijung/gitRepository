package exam.test;

class Product 
{
	String name = "";
	int price;		// 제품의 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스점수

	Product(){
		this(300);
	}
	
	Product(int price) {
		this(price, price + 10);
	}

	Product(int price, int bonusPoint) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
	
	int getPrice() {
		
		return price;
	}
	
	
	
	
}