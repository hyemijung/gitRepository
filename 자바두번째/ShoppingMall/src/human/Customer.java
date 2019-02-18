package human;

import products.tv.Tv; //import 다른폴더에 있는 클래스를 사용하고싶다면 명시적으로 적어줘야

public class Customer {

	public String name = "";
	public int money = 0;
	public Tv tv = null;	//중요!!!! Tv(객체)도 인스턴스변수에 적을수있다 
							// 사람은 Tv를 가지고있다고 말함 // Tv 안에서 쓸수있는거 여기서 다 쓸수있음
	
	public Customer() {
		
	}

	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
//	나의 정보 출력
	public void myInfoView() {
		System.out.println("이름: " + name);
		System.out.println("소지금: " + money);
		
//		tv.name = "sdf";  //실행하면 오류 왜? 값이 null 이므로 초기화하고 사용해야한다  
		
//		유효성 검사(안에 값이 있니 없니? 를 위한것)
		if(tv == null) {
			System.out.println("소지한 tv가 없습니다");
		}else {
			System.out.println("소지한 Tv 정보");
			tv.myInfoView();
		}
		
		System.out.println();
	}



}
