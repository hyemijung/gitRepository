
public class CarTest {
	public static void main(String[] args) {
// 메인메소드 안의 변수(지역변수)들이 사용자들이 무엇을 입력할지 결정되는 부분이다
// 변수는 언제만드나? 필요할때! 첼처음 만들면 만든후부터 계속 사용가능
		
		String color = "";     // 3> 샘방법 위해 복붙함
		String gearType = "";
		int door = 0;

		color = "white";        // 3> 샘방법 위해 복붙함
		gearType = "auto";
		door = 4;
	
		Car car = new Car(color,gearType,door); // 3> 샘이 하신 방법
		
//		Car car = new Car("white", "auto", 4); // 2>준혁씨가 알려줌// 메소드 불러오는 방법 생각못했음
//		
//		car.color = "white";  // 1> 내가 한 방법
//		car.gear = "auto";
//		car.door = 4;
//		
		System.out.println("자동차의 특징");
		System.out.println("색상은 " + car.color);
		System.out.println("변속기 종류는 " + car.gearType);
		System.out.println("문의 갯수는 " + car.door);
		System.out.println("인 자동차를 만들었습니다");

	}
}
