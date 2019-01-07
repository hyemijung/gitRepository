
public class Tv {

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
}
