package shoppoing.test;

import shoppoing.book.Comic;
import shoppoing.book.Java;
import shoppoing.product.Computer;
import shoppoing.product.Tv;
import shoppoing.user.Buyer;

public class ShopTest1 {
// 이전의 Shop 프로젝트에서 - 다형성을 접목한 것!!!!!
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer user1 = new Buyer("정혜미", 20000);
		Tv tv1 = new Tv("조은Tv", 100);
		Computer com1 = new Computer("조은 컴퓨터", 400);
		Java java1 = new Java("자바의 정석", 10000);
		Comic comic1 = new Comic("OnePiece", 4000);
		
		
		System.out.println("구매자의 이름은 " + user1.userName + "입니다");
		System.out.println(user1.userName + "님이 소지하신 금액은 " + user1.money + "입니다");
		System.out.println();
	
		user1.buy(tv1);
		user1.getBuyProductInfo();
		System.out.println();
		
		user1.buy(com1);
		user1.getBuyProductInfo();
		System.out.println();
		
		user1.buy(java1);
		user1.getBuyProductInfo();
		System.out.println();

		user1.buy(comic1);
		user1.getBuyProductInfo();
		
		
		
		
		
//		user1.buy(tv1);
//		System.out.println("Tv를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "입니다");
//		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println("tv1의 가격: " + tv1.price);
//		System.out.println();
//		
//		
//		user1.buy(com1);
//		System.out.println("Computer를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "입니다");
//		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println("com1의 가격: " + com1.price);
//		System.out.println();
//		
//		user1.buy(java1);
//		System.out.println("Java를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "입니다");
//		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println("java1의 가격: " + java1.price);
//		System.out.println();
//		
//		
//		user1.buy(comic1);
//		System.out.println("comic1를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "입니다");
//		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println("comic1의 가격: " + comic1.price);
//		System.out.println();

		

	}

}
