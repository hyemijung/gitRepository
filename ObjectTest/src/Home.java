//샘코드랑 비교(샘꺼에는 기본옵션들이 들어간 방식을 보여줌)
public class Home {

	int window = 0;
	int door = 0;
	int room = 0;

//	기본 생성자
	Home() {
                    // 이 부분에 구체적 변수 갯수를 적으면 기본 옵션이 있는 집을 지을수 있음
	}

//	창문만 초기화 가능한 생성자
	Home(int num1) {
		window = num1;

	}
	
//	창문과 문을 초기화 가능한 생성자
	Home(int num1, int num2) {
		window = num1;
		door = num2;

	}

	Home(int num1, int num2, int num3) {
		window = num1;
		door = num2;
		room = num3;

	}

//	출력 메서드 
	void print() {    
		System.out.println("창문 " + window + "문 " + door + "방 "+ room + "개인 집이 지어졌습니다" ); //syso는 인스턴트 메소드이므로 클래스안에서 단독 호출할수없다

	}
// 내가 오해하는 점 
}
