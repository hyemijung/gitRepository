package shoppoing.test;

import shoppoing.product.Computer;
import shoppoing.product.Product;
import shoppoing.product.Tv;
import shoppoing.user.Buyer;

public class ShopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer user1 = new Buyer();
		Product p = new Product();
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		
		user1.setUserName("정혜미");
		user1.setMoney(40000);
		user1.setBonusPoint(20);
		
		System.out.println(user1);
		
		p.setName("커피");
		p.setPrice(2500);
		p.setBonusPoint(250);
		
		System.out.println(p);
		
		com1.setName("더조은 컴퓨터");
		com1.setPrice(2000000);
		com1.setBonusPoint(20000);
		
		System.out.println(com1);
		
		tv1.setName("엘지 티비");
		tv1.setPrice(3000000);
		tv1.setBonusPoint(30000);
		
		System.out.println(tv1);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		System.out.println("Tv를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println("tv1의 가격: " + tv1.price);
//		System.out.println();
//		
//		user1.buy(com1);
//		
//		System.out.println("Computer를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println("com1의 가격: " + com1.price);
//		System.out.println();
//		
//		user1.buy(com1);
//		System.out.println("Computer를 구매못한 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println("com1의 가격: " + com1.price);
//		System.out.println();
	}

}
