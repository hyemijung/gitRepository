
public class AbstractPlayer extends Player {
//	The type AbstractPlayer must implement the inherited abstract method Player.stop()	
//	abstract를 부모클래스에서 사용했다면, 자식클래스에서는 부모에 있는 내용의 전부를 재정의하여 구현해야한다(강제)
	
	void play(int pos) {
		// 내용 생략
	}

	@Override		//annotation / 부모의 메서드가 재정의가 되었음을 알려준다
	void stop() {
		// TODO Auto-generated method stub

	}
	
	
	
}
