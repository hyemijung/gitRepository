
public class Tv extends Object{

	boolean power = false;
	int channel = 0;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void tvInfo() {
		System.out.println("일반 Tv");
		System.out.println("전원 상태: " + power);
		System.out.println("채널 값: " + channel);
	}
	
	
	
}
