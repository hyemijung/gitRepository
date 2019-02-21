package shoppoing.user;

import shoppoing.product.Product;

public class Buyer {

	public int money = 0;
	public int bonusPoint = 0;
	public String name = "";  // 여러명의 구매자가 있을것이다(So 구체적인 값을 넣으면 안됨)
	
	public Buyer() {
		
	}
	
	public Buyer(String name) {
		this.name = name;
	}
	
	public Buyer(String name, int money ) {
		this.name = name;
		this.money = money;
	}
		
	public void buy(Product product) {  // 이전과 차이점!!!!!
//		개별 자식들 대신에 부모를 보낸것(부모는 자식을 가질수 있다)!!!!1

		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (product.price - money));
			return;
		}
		
//		syso에(출력문) 관련된 모든 것은 UI이다

		money = money - product.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + product.bonusPoint; // 제품의 보너스 점수를 추가한다.

		String productNameStr = "";
		productNameStr = product.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다");

//		product.price = 32432; // 주소를 바꾼것
	}

	
}
