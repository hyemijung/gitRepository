package shoppoing.test;

import shoppoing.product.Computer;
import shoppoing.product.Tv;
import shoppoing.user.Buyer;

public class ShopTest1 {
// 이전의 Shop 프로젝트에서 - 다형성을 접목한 것!!!!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer user1 = new Buyer();
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		
//		Product p = new Tv();
//		Product p = tv1;
		
		user1.buy(tv1); //tv1은 값, 주소를 쓰겠다는것 주소를 전달한다 buy함수를 통해서
		
		System.out.println("Tv를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("tv1의 가격: " + tv1.price);
		System.out.println();
		
		user1.buy(com1);
		
		System.out.println("Computer를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("com1의 가격: " + com1.price);
		System.out.println();
		
		user1.buy(com1);
		System.out.println("Computer를 구매못한 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("com1의 가격: " + com1.price);
		System.out.println();
	}

}
