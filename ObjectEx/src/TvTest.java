
public class TvTest {

//	기능 = 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		표현식
//		클래스명 변수명;              클래스의 객체를 참조하기 위한 참조변수를 선언
//		변수명 = new 클래스명();      클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		
//		정적코드
//		동적코드
		Tv t;
		t = new Tv();
		

		t.channel= 7;
		t.channelDown(); 
		System.out.println("현재 채널은" + t.channel + "입니다");
		
	}

}
