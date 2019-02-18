package game.dice;

public class Dice {

	public int num = 0;
	
	public void diceThrow() {
		num = ((int)(Math.random() * 6)) + 1;
	}
	
	public void diceView() {
		System.out.println("주사위 숫자: " + num);
	}
	
	public int getDiceNum() {   // 다이스에있는 넘을 가져와서 언젠가 플레어가 필요할때 보여주려고
		return num;
	}
}
