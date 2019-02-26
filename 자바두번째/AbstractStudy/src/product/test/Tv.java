package product.test;

abstract class Tv {				// 클래스 앞에 abstract를 적으면 메인에서 객체생성 불가능 (abstract 메소드가 하나도 없더라도)
	
	protected boolean power = false;
	protected int channel = 0;
	protected int volume = 0;
	
	
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	abstract void power();				// 일부기능 미구현
	abstract void channelUp();
	abstract void channelDown();
	abstract void volumeUp();
	abstract void volumeDown();
	
	
	@Override
	public String toString() {   // 개발자가 내용을 확인하는 용도!!!
		return "Tv [power=" + power + ", channel=" + channel + ", volume=" + volume + "]";
	}
	
	
										// 사용자가 내용을 확인하는 용도!!!!!
//	public void printInfo() { 			// 일부기능 구현 // 부모꺼는 내꺼니깐 이거 사용가능
//		System.out.println(power);
//		System.out.println(channel);
//		System.out.println(volume);
//	}
	
}
