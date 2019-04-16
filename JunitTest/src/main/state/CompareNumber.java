package main.state;

import java.util.Random;

public class CompareNumber {

	public int compareNumDiff(int x, int y) {

		// 두 수의 차이를 알려주는 기능
		
		int result = 0;

		while (x != y) {

			if (x > y) {
				result = x - y;
			} else {
				result = y - x;
			}
		} // while end

		return result;

	}
	
	
	public int numberChange(int x) {
		
		
		int a = 2;
				
		if (x > 1) {
			x = x / a;
		} else if (a > 2){
			x = x + 1;
		}

		System.out.println("결과는: " + x);
		return x;

	}

	// 1~6 사이의 숫자를 반환한다
	public int diceNumber() {
		
		// Math.random 은 규칙이 있어서 사용하지 않는다
		Random rand = new Random();
		
		int diceNum = rand.nextInt(6)+1;
		
//		System.out.println(diceNum);
		
		return diceNum;
	}
	
	
	// 사용자가 특정 숫자를 입력했을때 그 숫자에 해당하는 구구단이 나오도록 만들어라
	// 리턴 타입이 void 인것은 어떻게 할것인가를 보려고 한다!!
	
	public void gugudanInsert(int x) {
		
		
			for (int j = 1; j < 10; j++) {
				
			int	result = x * j;
				System.out.println(x + "단 : " + x + "*" + j + "="+ result);
			}
		
		
		
		
	}
	
}
