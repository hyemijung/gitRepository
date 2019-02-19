package game.dice;

public class Dice {

	public int num = 0;
	
	public void diceThrow() {
		num = ((int)(Math.random() * 6)) + 1;
	}
	
	public void diceView() {
		System.out.println("주사위 숫자: " + num);
	}
	
	public int getDiceNum() {
		return num;
	}
}
