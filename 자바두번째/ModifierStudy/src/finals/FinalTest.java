package finals;

public class FinalTest {  // 여기에 public final class 로 적으면
//	자신을 확장한는 자손클래스를 정의하지 못한다(상속하지 못함), 그자체로 사용하라는 뜻
//그리하여 아래에 final로 변수 선언안되고 메서드 선언 안되도 , 전부다 사용할수 없다
	
	
	final int MAX_SIZE = 10;  // final은 명시적으로 값을 정해야한다. 한번 지정한 값은 절대 바꿀수 없다
	
	final int getMaxSize() {
		final int LV = MAX_SIZE;
//		MAX_SIZE = 100;			// 위에 final로 지정된 값이 있으므로, 값을 바꿀수 없다
//		LV = 234;				// final로 MAX_SIZE로 지정된 값이 있으므로, 값을 바꿀수 없다
		
		return LV;
	}

//	final은 값을 바꿀수 있니, 없니의 문제 - 불러다 사용하는 건 문제 없음
	
}
