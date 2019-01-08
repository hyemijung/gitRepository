// 카드케이스는 카드를 포함하고 있다
public class CardCase {
//	4 * 13 = 52장

	int numOfCards = Card.shape.length * Card.number.length;
	Card[] cardArr = new Card[numOfCards]; // 카드케이스에 52장의 카드가 필요하다고 생각되서 배열만듬 //52장의 카드가 하나의 세트로 존재하는게 서양카드이므로

//	card케이스 안에 카드 52장을 초기화해준다 만들어준다
	CardCase() {
		int totalCnt = 0;

		for (int i = 0; i < Card.shape.length; i++) {
//			{ "♥", "◆", "♠", "♣" };
//			{ "A", "2", "3", "4", "5", 
//					"6", "7", "8", "9", "T", "J", "Q", "K" };
			for (int n = 0; n < Card.number.length; n++) {
				cardArr[totalCnt++] = new Card(i, n);   // 하나의 카드를 만들고 있음(?)
			}
		} // 전체 for문 종료

	} // 기본 생성자 종료

	// 임의의 위치의 카드를 뽑느다
	Card pick() {                     //클래스명도 리턴타입이 된다
		int index = (int) (Math.random() * numOfCards);
		Card card = pick(index);       // pick(index)-메서드에서 메서드 호출가능 아래꺼 호출하는 것
//		Card card = cardArr[index];

		return card;   
	}

	// 지정된 위치의 카드를 뽑느다
	Card pick(int index) {          // 사용자가 입력하면 입력값을 받는다
//		Card card = cardArr[index];

		return cardArr[index];
	}

	// 카드 셔플
	void shuffle() {
		int rand = 0;
		Card temp = null;
		
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random()* numOfCards);
			
			temp = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = temp;
		}
	}
	
	
	void cardView() {
		for (int i = 0; i < cardArr.length; i++) {
			System.out.print(cardArr[i].getCard() + " ");
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}
