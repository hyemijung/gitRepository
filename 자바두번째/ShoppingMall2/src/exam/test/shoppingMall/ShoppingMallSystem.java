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
		
		
//		10명의 같은반 동기의 정보를 생성
//		공통이 없다 - 하나하나 전부 입력한다(for문 사용불가)

		
		
		Customer songJiwon = new Customer("송지원", 23, 3000000);
		Customer choeMungwon = new Customer("최문권", 25, 4000000);
		Customer joHyeseon = new Customer("조혜선", 23, 2000000);
		Customer kimJunhyeok = new Customer("김준혁", 32, 3000000);
		Customer leeGangin = new Customer("이강인", 36, 4000000);
		Customer jangHunil = new Customer("장훈일", 40, 500000);
		Customer parkGiseong = new Customer("박기성", 26, 600000);
		Customer parkDaeseong = new Customer("박대성", 25, 700000);
		Customer leeMyeongseon = new Customer("이명선", 26, 80000);
		Customer jeongMinseong = new Customer("정민성", 27, 900000);
		
//		가게와 판매물품 정보 생성
//		공통이 없다 - 하나하나 전부 입력한다(for문 사용불가)
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 1000000); 
		ProductStore appleStore = new ProductStore("거창 사과", 1000);
		ProductStore flowerStore = new ProductStore("푸른 장미", 10000);
		ProductStore bookStore = new ProductStore("취업 대비서", 12000);
		ProductStore bagStore = new ProductStore("백팩", 30000);
		ProductStore coffeeStore = new ProductStore("아메리카노", 3000);
		
//		위에 필요한 사람,가게,물건을 전부 만들어 놓고 아래에서 로직이 시작되는 것이다
		
		
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		computerStore.buy(songJiwon);
		computerStore.buy(choeMungwon);
		computerStore.buy(joHyeseon);
		computerStore.buy(kimJunhyeok);
		computerStore.buy(leeGangin);
		
		
		// 나머지 5며의 친구들은 전혀 다른 가게에서 물건을 하나씩 구입하시오
		
		
		
		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
		computerStore.buy(songJiwon);
		System.out.println("구매자의 이름: " + songJiwon.name);
		System.out.println("구매자의 나이: " + songJiwon.age);
		System.out.println("구매자의 남은 소지금 : " + songJiwon.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
		computerStore.buy(choeMungwon);
		System.out.println("구매자의 이름: " + choeMungwon.name);
		System.out.println("구매자의 나이: " + choeMungwon.age);
		System.out.println("구매자의 남은 소지금 : " + choeMungwon.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
		computerStore.buy(joHyeseon);
		System.out.println("구매자의 이름: " + joHyeseon.name);
		System.out.println("구매자의 나이: " + joHyeseon.age);
		System.out.println("구매자의 남은 소지금 : " + joHyeseon.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
		computerStore.buy(kimJunhyeok);
		System.out.println("구매자의 이름: " + kimJunhyeok.name);
		System.out.println("구매자의 나이: " + kimJunhyeok.age);
		System.out.println("구매자의 남은 소지금 : " + kimJunhyeok.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
		computerStore.buy(leeGangin);
		System.out.println("구매자의 이름: " + leeGangin.name);
		System.out.println("구매자의 나이: " + leeGangin.age);
		System.out.println("구매자의 남은 소지금 : " + leeGangin.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 appleStore 입니다.");
		appleStore.buy(jangHunil);
		System.out.println("구매자의 이름: " + jangHunil.name);
		System.out.println("구매자의 나이: " + jangHunil.age);
		System.out.println("구매자의 남은 소지금 : " + jangHunil.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 flowerStore 입니다.");
		flowerStore.buy(parkGiseong);
		System.out.println("구매자의 이름: " + parkGiseong.name);
		System.out.println("구매자의 나이: " + parkGiseong.age);
		System.out.println("구매자의 남은 소지금 : " + parkGiseong.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 bookStore 입니다.");
		bookStore.buy(parkDaeseong);
		System.out.println("구매자의 이름: " + parkDaeseong.name);
		System.out.println("구매자의 나이: " + parkDaeseong.age);
		System.out.println("구매자의 남은 소지금 : " + parkDaeseong.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 bagStore 입니다.");
		bagStore.buy(leeMyeongseon);
		System.out.println("구매자의 이름: " + leeMyeongseon.name);
		System.out.println("구매자의 나이: " + leeMyeongseon.age);
		System.out.println("구매자의 남은 소지금 : " + leeMyeongseon.money + "원");
		System.out.println();
		
		System.out.println("구매하기로 선택하신 스토어는 coffeeStore 입니다.");
		coffeeStore.buy(jeongMinseong);
		System.out.println("구매자의 이름: " + jeongMinseong.name);
		System.out.println("구매자의 나이: " + jeongMinseong.age);
		System.out.println("구매자의 남은 소지금 : " + jeongMinseong.money + "원");
		System.out.println();
		
	}

}
