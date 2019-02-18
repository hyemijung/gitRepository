package exam.test;

class Product 
{
	String name = "";
	int price;		// 제품의 가격 // 3000
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수// 300

	Product(){
		this(300);
	}
	
	Product(int price) { //3000
		this(price, price + 10);
	}

	Product(int price, int bonusPoint) {//(3000, 3010)
		this.price = price;				// 3000
		this.bonusPoint =(int)(price/10.0); // 300
	}
	
	int getPrice() {
		
		return price;
	}
	
	
	
	
}