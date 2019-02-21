package shoppoing.user;

import shoppoing.book.Book;
import shoppoing.product.Product;

public class Buyer {

	public int money = 0;
	public int bonusPoint = 0;
	public String userName = "";

	public Buyer(String name, int money) {
		this.userName = name;
		this.money = money;
	}

	public void buy(Product product) {
		// 구매이전에 필요한 정보출력을 buy메서드 안에 넣어줌 (아래 두줄)
		System.out.println(userName + "님이 가지고 계신 금액은" + money + "입니다");
		System.out.println("구매하시려는 제품의 가격은 " + product.price);
		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (product.price - money));
			return;
		}

		money = money - product.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + product.bonusPoint; // 제품의 보너스 점수를 추가한다.

		String productNameStr = "";
		productNameStr = product.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다");

	}

	public void buy(Book book) {
		System.out.println(userName + "님이 가지고 계신 금액은" + money + "입니다");
		System.out.println("구매하시려는 제품의 가격은 " + book.price);
		if (money < book.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (book.price - money));
			return;
		}

		money = money - book.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + book.bonusPoint; // 제품의 보너스 점수를 추가한다.

		String productNameStr = "";
		productNameStr = book.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다");
	}

//	구매후 정보를 보여주기 위한 메서드
	public void getBuyProductInfo() {
		System.out.println("현재 보너스 점수는 " + bonusPoint + "점입니다");
		System.out.println("현재 남은 돈은 " + money + "입니다");
	}

}