
public class Tv {

//	속성 - 변수, 필드, 상태
	String color; //색상
	boolean power; //전원
	int channel; //채널

//	기능 - 메서드, 함수, 행위
	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
}
