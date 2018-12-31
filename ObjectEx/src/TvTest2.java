
public class TvTest2 {

//	기능 = 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		표현식
//		클래스명 변수명;              클래스의 객체를 참조하기 위한 참조변수를 선언
//		변수명 = new 클래스명();      클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		
		Tv tv1 = new Tv();  
		Tv tv2 = new Tv();
		
		System.out.println("tv1의 채널값은" + tv1.channel + "입니다");
		System.out.println("tv1의 채널값은" + tv2.channel + "입니다");
		
		tv1.channel = 7;
		System.out.println("tv1의 channel의 값을 " + tv1.channel + "로 변경함");
		
		System.out.println("tv1의 channel 값은" + tv1.channel + "입니다");
		System.out.println("tv1의 channel 값은" + tv2.channel + "입니다");
		
	}

}
