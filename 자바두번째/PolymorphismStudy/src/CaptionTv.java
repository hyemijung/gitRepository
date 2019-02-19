
public class CaptionTv extends Tv {
	
	
	String text ="";
	
	void caption() {
		System.out.println("caption은 수행되었다");
		
	}
	
	void power() {
		System.out.println("부모의 것을 재정의 한것(오버라이딩)");
		power = !power;
	}
	
	
}
