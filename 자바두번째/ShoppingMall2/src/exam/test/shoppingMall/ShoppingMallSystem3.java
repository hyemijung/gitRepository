package exam.test.shoppingMall;

public class ShoppingMallSystem3 {

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

		Customer[] customerArr = new Customer[3];
		CustomerUtil customerUtil = new CustomerUtil();

		for (int i = 0; i < customerArr.length; i++) { 		// 중복되는 것들은 메서드로 넘어간다
			customerArr[0] = customerUtil.getCreateCustomer();   //홈페이지 만들때는 for문 필요없이 이부분만 필요 // onClick같은 이벤트로 처리한다
		}

		// 가게와 판매물품 정보 생성
//		공통이 없다 - 하나하나 전부 입력한다(for문 사용불가)

	}
}
