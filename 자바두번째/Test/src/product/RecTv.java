package product;

public class RecTv extends Tv {

	
	public boolean recStatus = false;
	
	public RecTv(){
		
	}
	
	public void tvInfoView() {
		this.power = true;
		this.volume = 11;
		this.recStatus = false;
				
	}
	
	public void tvInfoPrint() {
		System.out.println("rec텔레비전 상태보기");
		System.out.println("recTv의 전원상태: " + power);
		System.out.println("recTv의 볼륨: " + volume);
		System.out.println("recTv의 녹화상태: " + recStatus);
		
	}
	
}
