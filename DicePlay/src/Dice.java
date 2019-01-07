
public class Dice {

//	주사위 만들기

	int num = 0;

	void diceThrow() {
		num = (int) (Math.random() * 6) + 1; // 내가 한 실수 -> int num ->int를 num 앞에 붙이면 지역변수가 되어 메서드 안에서 사용되고 사라짐
	}

	void diceView() {
		System.out.println("주사위를 던저 나온 값은: " + num);
	}
}
