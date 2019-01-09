
public class CaptionTv extends Tv {
//Tv를 extends 했으므로 Tv에 있는 모든 기능 사용가능한 상태에서 CaptionTv만의 기능을 아래에서 만들겠다는 것
	boolean caption = false;
	
	void displayCaption(String text) {
		if(caption == true) {
			System.out.println(text);
		}
	}
	
	void tvInfo() {         // 부모의 메서드를 변경,추가 한것
		System.out.println("자막 Tv");  //변경
		System.out.println("전원 상태: " + power); // 그대로 사용 -> 재사용
		System.out.println("채널 값: " + channel);
		System.out.println("음소거: " + caption); // 새로운 내용 추가
	}
	
}
