import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {

		Card card = new Card();
		String myCard = "";
		int shapeIndex = 0; // 모양을 선택 1"♥", 2 "◆", 3"♠", 4"♣"
		int cardChoiceNumber = 0; // 1~13
//		myCard = card.getCard();  // 카드를 만들었을때 init을 한번 하고 보여주는 것 -> 그후 카드를 보여줌
//		
//		System.out.println("당신에게 준 카드는 ");  
//		System.out.println(myCard);

//		card.init();             

//		Scanner scan = new Scanner(System.in);
		shapeIndex = 2; // 내가 원하는 카드를 뽑는 것
		cardChoiceNumber = 12;

		card.init(shapeIndex, cardChoiceNumber);

		myCard = card.getCard();

		System.out.println("당신에게 준 카드는 ");
		System.out.println(myCard);

	}
}
