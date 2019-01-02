import java.util.logging.Handler;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		
//		입력
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 7;
		
		Card card2 = new Card();
		card1.kind = "Spade";
		card1.number = 4;
		
		
//		출력
		System.out.println("card1은 " + card1.kind + ", " + card1.number
				+ "이며, 크기는 " + card1.width + "," + card1.height);
		System.out.println("card2은 " + card1.kind + ", " + card2.number
				+ "이며, 크기는 " + card2.width + "," + card2.height);
		
		System.out.println("card1의 width와 height를 각각 50, 80으로 변경합니다"); // 클래스변수는 하나만 바꿔도 다 바뀜
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("card1은 " + card1.kind + ", " + card1.number
				+ "이며, 크기는 " + card1.width + "," + card1.height);
		System.out.println("card2은 " + card1.kind + ", " + card2.number
				+ "이며, 크기는 " + card2.width + "," + card2.height);
		
		
		
		
		
		
	}

}
