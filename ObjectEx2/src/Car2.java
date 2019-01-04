
//this 
//인스턴스 자신을 가르키는 참조변수(reference variable - 여야 주소를 저장할수 있다)
//인스턴스의 주소가 저장되어 있다
//모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다

public class Car2 {

	String color = "";
	String gearType = "";
	int door = 0;

	
//	매개변수가 있는 생성자
	Car2(String color, String gearType, int door) {
		this.color = color;     // this.하면 자기자신인 모든 인스턴스변수(Car2에 있는)를 가르킴
		this.gearType = gearType; // this는 주소를 가지고 있음, 그러므로 this.하면(주소. 한것과 같으므로) color(객체안의 변수 - 인스턴스 변수)에 접근가능
		this.door = door;           // this. 안붙은 color는 매개변수 // this.이 있으므로 같은 철자color라도 다른 역할을 하는것
	}                               // this쓰는 이유? 변수명을 의미있는 이름으로 만들어 신뢰성 있는 코드 작성 가능
	                                // this 쓸때? 생성자나 메서드를 초기화할때

	
	
	
	void carInfo() {
		System.out.println("색상: " + color);
		System.out.println("기어타입: " + gearType);
		System.out.println("문 갯수" + door);
	}
}
