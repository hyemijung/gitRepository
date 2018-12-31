
public class TvTest2 {

//	기능 = 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		표현식
//		클래스명 변수명;              클래스의 객체를 참조하기 위한 참조변수를 선언
//		변수명 = new 클래스명();      클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장

		Tv mytv = new Tv();
		Tv partnertv = new Tv();
		Tv mstv = new Tv();

		mytv.power = true;
		mytv.channel = 1;
		System.out.println("mytv 전원 " + mytv.power);
		System.out.println("mytv 채널은 " + mytv.channel);
		System.out.println();
		
		partnertv.power = true;
		partnertv.channel = 7;
		System.out.println("partnertv 전원 " + partnertv.power);
		System.out.println("partnertv 채널은 " + partnertv.channel);
		System.out.println();

		mstv.power = false;
		mstv.channel = 3;
		System.out.println("mstv 전원 " + mstv.power);
		System.out.println("mstv 채널은 " + mstv.channel);
		System.out.println();
	}

}
