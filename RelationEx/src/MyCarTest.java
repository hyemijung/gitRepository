
public class MyCarTest {
	public static void main(String[] args) {

		Car myCar = new Car();
				
		
		myCar.ai.welcomeVoice(); // .ai해서 기본형태 차를 부르고 .Ai를 더하여 인공지능 기능 메서드를 부르는 것
		
		myCar.door = 2;
		
		System.out.println(myCar.ai); // 주소
		
	}

}
