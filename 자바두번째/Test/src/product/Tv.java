package product;

public class Tv {

	public boolean power = false;
	public int volume = 0;
	
	public Tv(){
		
		
	}
	
	public void tvInfoView() {
		this.power = true;
		this.volume = 7;
	}
	
	
	public void tvInfoPrint() {
		System.out.println("텔레비전 상태보기");
		System.out.println("Tv의 전원상태: " + power);
		System.out.println("Tv의 볼륨: " + volume);
		
	}
	
}
