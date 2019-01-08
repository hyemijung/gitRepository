
public class CardPlay {
	public static void main(String[] args) {

		CardCase cardCase = new CardCase();
		Card card =  null;
		
		cardCase.shuffle();
		
		cardCase.cardView();
		
		card = cardCase.pick(13);
		
		System.out.println(card.getCard());
		
		
	}
}
