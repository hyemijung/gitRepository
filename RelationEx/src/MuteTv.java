//11차 강의
public class MuteTv extends Tv {  // extends 해야 Tv기능 다 사용가능함

	int volume = 0;
	boolean mute = false;
	int preVolume = 0; // 코드를 짜다보니 이전볼륨이 필요하다는 사실을 깨닫고 만들어야 함

	void muteButton() {
		mute = !mute; // 사용자가 값을 입력하는것이 아니라 버튼을 누를때마다 바뀌는 음소거 //매개변수 없음

		if (mute == true) {
			preVolume = volume; // preVolume은 이전 볼륨값을 기억하고 있다
			volume = 0;
		} else {
			volume = preVolume;  // 
		}
	}

//내가 하려던 방법	
//	void muteButton(boolean mute) {     // 매개변수를 던지면 안됨// 사용자가 값을 입력한 것이 아니므로
//		this.mute = mute;
//		if (mute == true) {
//			preVolume = 7;
//			volume = 0;
//			System.out.println("음소거 " + mute);
//		} else {
//			volume = preVolume;
//			System.out.println("음소거 끔");
//		}
//	}

	void tvInfo(boolean power, int channel, int volume, boolean mute) {

	}
}
