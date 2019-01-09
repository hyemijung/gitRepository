
public class Coffee extends Drink {

	int caffeine = 0;
	
	void drinkInfo() {
		System.out.println("커피 이름: " + name);
		System.out.println("용량 " + ml +"ml");
		System.out.println("가격 " + price);
		System.out.println("카페인 " + caffeine + "%");
	}

}
