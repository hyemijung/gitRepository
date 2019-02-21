package shopping.user;


import shopping.product.Product;

// 대승씨 코드
public class Buyer {
	public int money = 0;
	public String name = "";
	public int bounsPoint = 0;
	String productName = "";
	
	public Buyer() {
		money = 150;
	}
	
	public Buyer(int money, String name) {
		this.name = name;
		this.money = money;
	}
	
	
	public void buy(Product product) {
		
		productName = "";
		productName = product.productName;
		System.out.println(name+"님 ");
		System.out.println(productName+"의 가격은 "+product.price+"만원 입니다.");
		
		if(money < (product.price)) {
			System.out.println(productName+"을 구매 하려 하였으나...");
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");			
			System.out.println(product.price-money+"만원 만큼 부족합니다.");
			System.out.println();
			return;
		}
		
		money = money - product.price;
		bounsPoint = bounsPoint + product.bonusPoint;
		
		System.out.println(productName + "을 구매하셨습니다.");
		System.out.println();
		System.out.println("현재 남은 돈은 "+ money+"만원 입니다.");
		System.out.println("현재 보너스 포인트는 "+bounsPoint+"만점 입니다.");
		System.out.println();
	}
	
	
	
	
}
