package shoppoing.test;

import shoppoing.product.Computer;
import shoppoing.product.Notebook;
import shoppoing.product.Tv;
import shoppoing.user.Buyer;

public class ShopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		노트북의 가격은 기본은 300만원이다
//		노트북의 보너스 포인트는 가격의 10분의 1이다
//
//		사람은 노트북을 구매할 수 있다
//
//		사람은 Tv를 구매했고
//		돈이 남아서
//		노트북을 구매했고
//		돈이 남아서
//		컴퓨터를 구매했다
		

		Buyer user1 = new Buyer();
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		Notebook ntb1 = new Notebook();

		user1.buy(tv1); // tv1은 값, 주소를 쓰겠다는것 주소를 전달한다 buy함수를 통해서
		System.out.println("Tv를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("tv1의 가격: " + tv1.price);
		System.out.println();

		user1.buy(ntb1);
		System.out.println("Notebook를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("ntb1의 가격: " + ntb1.price);
		System.out.println();

		user1.buy(com1);
		System.out.println("Computer를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("com1의 가격: " + com1.price);
		System.out.println();
		
		
		
		
	}

}
