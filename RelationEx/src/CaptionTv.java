
public class CaptionTv extends Tv {
//Tv를 extends 했으므로 Tv에 있는 모든 기능 사용가능한 상태에서 CaptionTv만의 기능을 아래에서 만들겠다는 것
	boolean caption = false;
	
	void displayCaption(String text) {
		if(caption == true) {
			System.out.println(text);
		}
	}
	
}
