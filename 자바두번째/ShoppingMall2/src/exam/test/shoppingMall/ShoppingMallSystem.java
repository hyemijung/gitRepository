package exam.test.shoppingMall;

public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
//		배열을 하나도 작성하지않고 만들어라!
		
		Customer songJiwon = new Customer("송지원", 23, 1000000);
		Customer choeMungwon = new Customer("최문권", 25, 1000000);
		Customer joHyeseon = new Customer("조혜선", 25, 2000000);
		Customer kimJunhyeok = new Customer("김준혁", 32, 3000000);
		Customer leeGangin = new Customer("이강인", 36, 4000000);
		Customer jangHunil = new Customer("장훈일", 40, 500000);
		Customer parkGiseong = new Customer("박기성", 26, 600000);
		Customer parkDaeseong = new Customer("박대성", 25, 700000);
		Customer leeMyeongseon = new Customer("이명선", 26, 80000);
		Customer jeongMinseong = new Customer("정민성", 27, 900000);
		
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 1000000); 
		ProductStore appleStore = new ProductStore("거창 사과", 1000);
		ProductStore flowerStore = new ProductStore("푸른 장미", 10000);
		ProductStore bookStore = new ProductStore("취업 대비서", 12000);
		ProductStore bagStore = new ProductStore("백팩", 30000);
		ProductStore coffeeStore = new ProductStore("아메리카노", 30000);
		
		computerStore.buy(songJiwon);
		System.out.println(songJiwon.name);
		System.out.println(songJiwon.age);
		System.out.println(songJiwon.money);
		
		computerStore.buy(choeMungwon);
		System.out.println(choeMungwon.name);
		System.out.println(choeMungwon.age);
		System.out.println(choeMungwon.money);
		
		computerStore.buy(joHyeseon);
		System.out.ㅈprintln(joHyeseon.name);
		System.out.println(joHyeseon.age);
		System.out.println(joHyeseon.money);

		computerStore.buy(kimJunhyeok);
		System.out.println(kimJunhyeok.name);
		System.out.println(kimJunhyeok.age);
		System.out.println(kimJunhyeok.money);
		
		computerStore.buy(leeGangin);
		System.out.println(leeGangin.name);
		System.out.println(leeGangin.age);
		System.out.println(leeGangin.money);
		
		
		
		
		appleStore.buy(gangsucwon);
		System.out.println(gangsucwon.name);
		System.out.println(gangsucwon.age);
		System.out.println(gangsucwon.money);
		
		
		
	}

}
