package exam.test.shoppingMall;

import java.util.Scanner;

public class CustomerUtil {

	public Customer getCreateCustomer() {
		
		Customer customer = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("고객님의 성함을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("고객님의 나이를 입력해주세요");
		int age = scan.nextInt();
		System.out.println("충전하실 금액을 입력해주세요");
		int money = scan.nextInt();
		customer = new Customer( name,  age,  money); // 사용자 입력부분은 개발자가 관여하지않는 것
		
		return customer;
	}

}
