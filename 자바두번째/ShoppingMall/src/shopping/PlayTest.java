package shopping;

import human.Customer;
import products.tv.Tv;
import shop.DigitalShop;

public class PlayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		메인에서 로직이 결정되는 것이다!!!
//		설계도에서는 설정이나 변하지 않는 값들만 있다
		
		Customer customer = new Customer("홍길동", 5000);
		Tv tv = new Tv("메가Tv", 5000); //가게에 tv가 있어야해서 tv를 가게 이전에 먼저 만든것(tv가 없으면 가게에서 판매를 못함)
		DigitalShop ds = new DigitalShop("더조은샵", 100000, tv); //앞에서 tv를 만들고 가게에 tv를 매개변수로 넣어줌
							// tv라는 ,객체도 매개변수로 전달할수 있다!!!!
		
		
//		customer.tv= tv; // 해줘야 tv의 null 값이 사라지고 초기화 된것
		
		customer.myInfoView();
		
		ds.showProducts();
		
		ds.sellProduct(customer); //생성자 덕분에 초기화되어 사용가능한 것
		
		customer.myInfoView();
		
//		tv를 판매했으니 이젠 티비가 없다
//		ds.showProducts();
		
		
		
		
	}

}
