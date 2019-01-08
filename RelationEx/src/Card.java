
public class Card {

	static String[] shape = { "♥", "◆", "♠", "♣" }; // 모양삽입 : 한글 -> ㅁ 누른상태에 한자버튼 누르기
	static String[] number = { "A", "2", "3", "4", "5", // 서양카드는 이것이 기본이라 static 사용
			"6", "7", "8", "9", "T", "J", "Q", "K" };

//	카드
	String card = "";

//	생성자
	Card() {

	}

	Card(int shapeIndex, int numberIndex) {
		init(shapeIndex, numberIndex);
	}

//	오버로딩 (임의로 카드생성 + 수동으로 카드 생성)
//	임의로 카드 생성
	void init() { // 매개변수 없음 - 이 안의 로직에서 끝남
		// 모양 랜덤으로 선택
		int shapeIndex = (int) (Math.random() * shape.length);
		// 숫자 랜덤으로 선택
		// 난수 생성
		int numberIndex = (int) (Math.random() * number.length);

		card = shape[shapeIndex] + number[numberIndex]; // ♣A, ♥3 이런식의 카드가 나옴
	}

// 수동으로 카드 생성
	void init(int shapeIndex, int numberIndex) { // 매개변수 사용 - 다른 곳에서 값을 사용함
		card = shape[shapeIndex] + number[numberIndex];
	}

//	카드 얻는다
	String getCard() {
		return card;
	}
}
