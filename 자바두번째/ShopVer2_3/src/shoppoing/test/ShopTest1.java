package shoppoing.test;

import java.util.Scanner;

import shoppoing.product.Computer;
import shoppoing.product.Tv;
import shoppoing.user.Buyer;

public class ShopTest1 {
// 이전의 Shop 프로젝트에서 - 다형성을 접목한 것!!!!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구매자의 소지금을 입력해주세요");
		int inputMoney = scan.nextInt();
		
		Buyer user1 = new Buyer("정혜미", 500);   // 이후 어떤 사용자가 될지모르는 변화할수 있는 아이
		Buyer user2 = new Buyer("박성욱", inputMoney);   // 이후 어떤 사용자가 될지모르는 변화할수 있는 아이

//		System.out.println("구매자의 이름: " + user1.name); 위의 사용자가 맞는지 상세하게 조회해서 확인해보려는 것
//		System.out.println("구매자의 돈: " + user1.money);
		
		
		
		
		Tv tv1 = new Tv("조은 Tv", 100);
		Tv tv2 = new Tv("아카데미 Tv");
				
//		System.out.println("제품의 이름: " + tv1.productName); 
//		System.out.println("제품의 가격: " + tv1.price);
				
		Computer com1 = new Computer("아카데미 com");
		Computer com2 = new Computer("조은 com");
		
		
		
		



		user1.buy(tv1);
		System.out.println("Tv를 구매한 후 사용자의 정보");
		System.out.println("사용자의 이름은 " + user1.name);
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("tv1의 가격: " + tv1.price);
		System.out.println();

		user1.buy(com1);
		System.out.println("Computer를 구매한 후 사용자의 정보");
		System.out.println("사용자의 이름은 " + user1.name);
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다");
		System.out.println("com1의 가격: " + com1.price);
		System.out.println();

	}

}
