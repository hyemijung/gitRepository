
public class DrinkCoffeeTest {

	public static void main(String[] args) {
		
		Drink drink = new Drink();
//		Coffee coffee = new Coffee();   //이렇게 적는다면  두가지 모두를 선언했기 때문에 -> 커피와 drink의 정보를 활용 할수있다 ex> 사이다 섞은 커피;;;
		
		drink.name = "사이다";
		drink.ml = 100;
		drink.price = 1000;
		drink.drinkInfo();
		
		System.out.println();
		                                
		Coffee coffee = new Coffee();  //(이 형태를 기본으로 생각해!)내가 한것처럼하면 drink 와 커피를 따로따로하여 정의하겠다는 것(구분이 가능하고 보기 좋음)
		
		coffee.name = "카페라떼";
		coffee.ml = 100;
		coffee.price = 1000;
		coffee.caffeine = 10;
		coffee.drinkInfo();
	}
	
}
