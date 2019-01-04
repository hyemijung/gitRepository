
public class Car {
//
//	색상 - String color
//	변속기의 종류(자동, 수동) - String gearType
//	문의 개수 = int door	

//	인스턴스 변수는 사라지지 않는다
	String color = "";
	String gearType = "";
	int door = 0;

//	생성자

//	기본생성자
	Car() {

	}

	Car(String color1, String gearType1, int door1) {
		color = color1;
		gearType = gearType1;
		door = door1;
	}

}

// 내가 잘못한 것과 잘못된 사고의 흐름
// 기본 생성자 빼먹음
// Car(매개변수) - 종류별로 다만듬 & 매개변수 이름 잘못만듬
//ex) Car(String color)
//    Car(String gear)
//    Car(int door)