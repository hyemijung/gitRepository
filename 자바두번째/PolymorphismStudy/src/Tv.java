
public class Tv {
	
	boolean power = false;
	int channel = 0;
	
//	티비 파워 전원 버튼
	void power() {
		System.out.println("Tv에서 수행한 것");
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	

	void channelDown() {
		--channel;
	}
	
	
	
}
