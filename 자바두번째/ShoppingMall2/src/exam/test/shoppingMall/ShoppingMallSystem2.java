package exam.test.shoppingMall;

public class ShoppingMallSystem2 {

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
		// 어떤 사람의 정보가 올지는 사용자가 입력할 사항(누군지는 중요하지않음) - 개발자는 신경쓰지 않는다

		Customer[] customerArr = new Customer[10];

		for (int i = 0; i < customerArr.length; i++) {
			customerArr[i] = new Customer("송지원" + i, 23 + i, (3000000 * i) + 2000000); // 사용자 입력부분은 개발자가 관여하지않는 것
			System.out.println(customerArr[i].name + "의 나이는 " + customerArr[i].age + "세이고 남은 소지금은 "
					+ customerArr[i].money + "입니다");
			System.out.println();
		}

		
		//		가게와 판매물품 정보 생성
//		공통이 없다 - 하나하나 전부 입력한다(for문 사용불가)

		ProductStore[] productStoreArr = new ProductStore[6];

		for (int i = 0; i < productStoreArr.length; i++) {
			productStoreArr[i] = new ProductStore("최고의 컴퓨터" + i, 1000000 + i);
			System.out.println();
		}
		
		
		
		
//		위에 필요한 사람,가게,물건을 전부 만들어 놓고 아래에서 로직이 시작되는 것이다

		// 5명의 친구들은 모두 컴퓨터를 구입한다
//		computerStore.buy(songJiwon);
//		computerStore.buy(choeMungwon);
//		computerStore.buy(joHyeseon);
//		computerStore.buy(kimJunhyeok);
//		computerStore.buy(leeGangin);

		// 안에 누군지는 중요하지않음 - 5명이 구매했다는 것이 중요해서 반복문으로 처리

//		(기억) 구매와 출력을 보여주는 것을 분리하라 - 기능의 분리!!!!!!!!!
//		
//		for (int i = 0; i < 5; i++) {
//			productStoreArr[0].buy(customerArr[i]);
//			System.out.println(productStoreArr[0]);
//			System.out.println(customerArr[i]);
//			System.out.println();
//		}

		// 구매
		for (int i = 0; i < 5; i++) {
			productStoreArr[0].buy(customerArr[i]);
			System.out.println();
		}

		// 출력
		for (int i = 1; i < 6; i++) {
			System.out.println(productStoreArr[0]);
			System.out.println(customerArr[i]);
			System.out.println();
		}

		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나씩 구입하시오

//		productStoreArr[1].buy(customerArr[5]);
//		productStoreArr[2].buy(customerArr[6]);
//		productStoreArr[3].buy(customerArr[7]);
//		productStoreArr[4].buy(customerArr[8]);
//		productStoreArr[5].buy(customerArr[9]);

		// 구매
		for (int i = 0; i < 5; i++) {
			productStoreArr[i].buy(customerArr[i + 4]);
		}
		
		// 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(productStoreArr[i + 1]);
			System.out.println(customerArr[i + 4]);
			System.out.println();
		}

		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나씩 구입하시오
//		appleStore.buy(jangHunil);
//		flowerStore.buy(parkGiseong);
//		bookStore.buy(parkDaeseong);
//		bagStore.buy(leeMyeongseon);
//		coffeeStore.buy(jeongMinseong);

		// (배열로 바꿈)나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나씩 구입하시오
//		appleStore.buy(customerArr[5]);

//		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
//		computerStore.buy(songJiwon);
//		System.out.println("구매자의 이름: " + songJiwon.name);
//		System.out.println("구매자의 나이: " + songJiwon.age);
//		System.out.println("구매자의 남은 소지금 : " + songJiwon.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
//		computerStore.buy(choeMungwon);
//		System.out.println("구매자의 이름: " + choeMungwon.name);
//		System.out.println("구매자의 나이: " + choeMungwon.age);
//		System.out.println("구매자의 남은 소지금 : " + choeMungwon.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
//		computerStore.buy(joHyeseon);
//		System.out.println("구매자의 이름: " + joHyeseon.name);
//		System.out.println("구매자의 나이: " + joHyeseon.age);
//		System.out.println("구매자의 남은 소지금 : " + joHyeseon.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
//		computerStore.buy(kimJunhyeok);
//		System.out.println("구매자의 이름: " + kimJunhyeok.name);
//		System.out.println("구매자의 나이: " + kimJunhyeok.age);
//		System.out.println("구매자의 남은 소지금 : " + kimJunhyeok.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 computerStore 입니다.");
//		computerStore.buy(leeGangin);
//		System.out.println("구매자의 이름: " + leeGangin.name);
//		System.out.println("구매자의 나이: " + leeGangin.age);
//		System.out.println("구매자의 남은 소지금 : " + leeGangin.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 appleStore 입니다.");
//		appleStore.buy(jangHunil);
//		System.out.println("구매자의 이름: " + jangHunil.name);
//		System.out.println("구매자의 나이: " + jangHunil.age);
//		System.out.println("구매자의 남은 소지금 : " + jangHunil.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 flowerStore 입니다.");
//		flowerStore.buy(parkGiseong);
//		System.out.println("구매자의 이름: " + parkGiseong.name);
//		System.out.println("구매자의 나이: " + parkGiseong.age);
//		System.out.println("구매자의 남은 소지금 : " + parkGiseong.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 bookStore 입니다.");
//		bookStore.buy(parkDaeseong);
//		System.out.println("구매자의 이름: " + parkDaeseong.name);
//		System.out.println("구매자의 나이: " + parkDaeseong.age);
//		System.out.println("구매자의 남은 소지금 : " + parkDaeseong.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 bagStore 입니다.");
//		bagStore.buy(leeMyeongseon);
//		System.out.println("구매자의 이름: " + leeMyeongseon.name);
//		System.out.println("구매자의 나이: " + leeMyeongseon.age);
//		System.out.println("구매자의 남은 소지금 : " + leeMyeongseon.money + "원");
//		System.out.println();

//		System.out.println("구매하기로 선택하신 스토어는 coffeeStore 입니다.");
//		coffeeStore.buy(jeongMinseong);
//		System.out.println("구매자의 이름: " + jeongMinseong.name);
//		System.out.println("구매자의 나이: " + jeongMinseong.age);
//		System.out.println("구매자의 남은 소지금 : " + jeongMinseong.money + "원");
//		System.out.println();

	}

}
