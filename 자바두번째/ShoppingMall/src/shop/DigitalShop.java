package shop;

import human.Customer;
import products.tv.Tv;

public class DigitalShop {
	
	public String shopName = "";
	public Tv tv = null;  //선택//가게가 tv를 가진다(has)// null의미: 가게에서 티비를 가진다고해서 언제 티비가 실제로 있게될지는 정해지지않음
//	public Tv tv2 = new Tv();  //필수//가게가 tv를 가진다(has)// null의미: 가게에서 티비를 가진다고해서
	public int money = 0;
	
	public DigitalShop() {
		shopName = "더조은 샵";
		money = 100000;		// 10만원
	}
	
	public DigitalShop(String shopName, int money) {
		this.money = money;
		this.shopName = shopName;
		
	}
	
	public DigitalShop(String shopName, int moneym, Tv tv) {
		this.money = money;
		this.shopName = shopName;
		this.tv = tv;
	}
	
//	가게에 존재하는 제품 보여주기
	public void showProducts(){
		System.out.println("가게이름: " + shopName);
//		System.out.println("가게소지금: " + money); //가게소지금 보여줄수 있지만 굳이 고객에게 보여줄 필요가 없다
		
		if(tv == null) {
			System.out.println("소지한 tv가 존재하지 않습니다");
		}else {
			tv.myInfoView();
		}
		
		
		tv.myInfoView();
	}
	
//	가전제품을 고객에게 판매하는 기능
	public void sellProduct(Customer customer){ // 고객이 찾아왔다 갔다하는 시점에 매개변수를 던져주면 된다(?)
										// 매개변수의 힘: 어떤순간에 고객은 가게를 찾아와서 티비를 사고 떠난다 - 그래서 지역변수
		money = money + tv.price;
		customer.money = customer.money - tv.price;
		
		customer.tv = tv;
		
		tv = null;
		
		System.out.println("tv를 팔았습니다");
		System.out.println();
	}
}
 