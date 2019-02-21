package shoppoing.test;

import java.util.Scanner;

import shoppoing.product.Computer;
import shoppoing.product.Tv;
import shoppoing.user.Buyer;

public class ShopTest1 {
// 이전의 Shop 프로젝트에서 - 다형성을 접목한 것!!!!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer user1 = new Buyer();
		Tv tv1 = new Tv(100, "조은Tv");
		Tv tv2 = new Tv(300, "아카데미 Tv");
		Computer com1 = new Computer(400, "조은 컴퓨터");
		
		Computer com2 = new Computer(scan.nextInt(), "아카데미 com");
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("조혜선씨의 소지금을 입력해주세요");
		user1.money = scan.nextInt();

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
