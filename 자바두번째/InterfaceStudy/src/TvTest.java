
public class TvTest {

	public static void main(String[] args) {
		
//		Tv tv = new Tv();
		
		MuteTv mTv = new MuteTv();
		Tv mTv2 = new MuteTv(); // 다형성
		
		mTv.power();
		mTv.getVolume();
		
//		System.out.println(mTv.POWER);  // 아래와 같이 클래스명으로 사용하라
		System.out.println(MuteTv.POWER);	// POWER static 변수이므로, 클래스명. 해서 사용하라
	}
}
