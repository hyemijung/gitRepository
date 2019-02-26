package product.test;

public class muteTv extends Tv {

	@Override
	void power() {
		// TODO Auto-generated method stub
		power = !power;

		if (power == true) {
//			System.out.println("Tv전원이 켜졌습니다");
		} else if (power == false) {
//			System.out.println("Tv전원이 꺼졌습니다");
		}
	}

	@Override
	void channelUp() {
		// TODO Auto-generated method stub
		channel++;
//		System.out.println("채널번호는 " + channel + "입니다");
	}

	@Override
	void channelDown() {
		// TODO Auto-generated method stub
		channel--;
//		System.out.println("채널번호는 " + channel + "입니다");
	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
//		System.out.println("볼륨은 " + volume + "입니다");
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
//		System.out.println("볼륨은 " + volume + "입니다");
	}

}
