package shopping.test;

import java.util.Scanner;

import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class Main {

	public static void main(String[] args) {
		int money1 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("장훈일님의 소지금은?");
		money1 = scan.nextInt();
		Buyer user1 = new Buyer(500, "박대승");
		Buyer user2 = new Buyer(money1, "장훈일");
		
		Tv tv1 = new Tv(100,"조은 Tv");
		Tv tv2 = new Tv(300,"아카데미 Tv");
		int price = 0;
		
		System.out.println("아카데미 컴퓨터의 가격은?");
		price = scan.nextInt();
		
		Computer com1 = new Computer(400,"조은 com");
		Computer com2 = new Computer(price, "아카데미 com");
		
		
		
		user1.buy(tv1);
		user1.buy(com1);
		
		user2.buy(com1);
		user2.buy(com2);
		
		
	}

}
