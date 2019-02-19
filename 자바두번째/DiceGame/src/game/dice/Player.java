package game.dice;

public class Player {
	
	public String name = "";
	public int totalNumDice = 0;
//	public Dice dice = null; // 주사위 내 소유, 이후에 여러 유저가 있으면 사라질 계획
	
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
	}
	
//	플레이어는 주사위를 가지고 있지않은데, 주사위가 있는것 처럼 느껴지게하는게, 필요할떄 매개변수를 받아서 주사위 기능을 사용 하는 것
//이전엔 주사위가 필요가없고 이시점에서 주사위의 활용이 필요했기 때문이다
	public void diceThrow(Dice dice) {
		dice.diceThrow();
		dice.diceView();
		
		totalNumDice = totalNumDice + dice.getDiceNum(); 
	}
	
	public void myInfoView() {
		System.out.println("==============플레이어 정보==============");
		System.out.println("플레이어 이름: " + name);
		System.out.println("주사위를 굴린 숫자의 총합: " + totalNumDice);
		System.out.println("=====================================");
		System.out.println();
	}
	
	
	
	
}
