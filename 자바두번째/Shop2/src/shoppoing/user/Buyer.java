package shoppoing.user;

import shoppoing.product.Computer;
import shoppoing.product.Notebook;
import shoppoing.product.Tv;

public class Buyer {

	public int money = 1000;
	public int bonusPoint = 0;

	    public void buy(Tv tv) { // 참조형, 즉 객체를 매개변수로 전달한것(tv라는 주소 그자체)
		// tv1과 tv가 가르키는 주소가 같다. 그러므로 여기서 tv를 바꾸면 주소가 같은 tv1도 영향을 받는다

		if (money < tv.price) {   // validation 체크!!
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money = money - tv.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + tv.bonusPoint; // 제품의 보너스 점수를 추가한다.

		String ProductNameStr = "";
		ProductNameStr = tv.myProductName();
		System.out.println(ProductNameStr + "를 구입하셨습니다");

//		tv.price = 32432; // 주소를 바꾼것
	}

	public void buy(Notebook notebook) {

		if (money < notebook.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money = money - notebook.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + notebook.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(notebook.myProductName() + "를 구입하셨습니다");
	}

	public void buy(Computer computer) {

		if (money < computer.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money = money - computer.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + computer.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(computer.myProductName() + "를 구입하셨습니다");

	}

}
