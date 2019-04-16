package test.state;

import org.junit.Assert;
import org.junit.Test;

import main.state.CompareNumber;

public class CompareNumberTest {
	// 계속 사용할 것이므로 인스턴스 변수로 밖으로 빼냄
	// 아래 CompareNumber 클래스만 테스트 할것이므로
	CompareNumber cn = new CompareNumber();

	// Jnuit 을 사용하면 메인을 만들 필요가 없다
	// 만든 메서드는 전부 테스트해야한다
	// 다 따로따로 하나하나 테스트 한다

	// 두 수의 차이를 알려주는 기능
	@Test
	public void testCompareNumDiff() {
//		CompareNumber cn = new CompareNumber();

		int x = 4;
		int y = 2;

		int result = cn.compareNumDiff(x, y);

		// 하나의 값을 비교할땐 Equal (=)
		Assert.assertEquals(-1, result);

	}

	// 주어진 값이 1보다 크면 주어진 값 / 2
	// 주어진 값이 2보다 크면 주어진 값 * 2
	@Test
	public void testNumberChange() {
//		CompareNumber cn = new CompareNumber();
		int x = -1;
		int result = cn.numberChange(x);

//		리턴되는 값이 어떤 것인지 파악해서 아래의 Assert.~ 중 무엇을 써야할지 결정해야한다
//		1. 하나의 값은 assertEquals 로
//		2. 범위의 값은 assertTrue 로

		// 하나의 값을 비교할땐 Equal (=)
		Assert.assertEquals(-1, result);
		Assert.assertNotEquals(1, result);

		// 객체가 넘어왔는지 체크 여부 (참조 연산자 : null) - 객체에 있는 주소 참조
//		Assert.assertNotNull(object); 
		// 같은 객체는 맞는데 안에있는 인스턴스 변수가 같은지 다른지 체크 - 객체에 있는 값 참조
//		Assert.assertNotSame(unexpected, actual);

		// ture, false 테스트
//		Assert.assertTrue(condition);
//		Assert.assertFalse(condition);
	}

	// 1~6 사이의 숫자를 반환한다
	@Test
	public void testDiceNumber() {

		int result = cn.diceNumber();

		Assert.assertTrue("결과값 + " + result, (1 <= result) && (result <= 6));

	}

	// 사용자가 특정 숫자를 입력했을때 그 숫자에 해당하는 구구단이 나오도록 만들어라
	
	@Test
	public void testGugudanInsert() {

		int x;
		x = 5;
		
		cn.gugudanInsert(x);
	}

}
