
public class Manage {

	String name = "";
	String made = "";
	int price = 0;
	int ea = 0;

	Manage() {                  // 기본 생성자
		
	}

	Manage(String name, String made, int price, int ea) {  // 매개변수가 있는 생성자
		this.name = name;
		this.made = made;
		this.price = price;
		this.ea = ea;
	}
	
	void manageSnack() {
		System.out.println("이름 = " + name);
		System.out.println("재조사 = " + made);
		System.out.println("가격 = " + price);
		System.out.println("갯수 = " + ea);
		
	}
  
}
