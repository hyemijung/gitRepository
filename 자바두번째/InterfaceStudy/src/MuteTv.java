// 추상클래스이므로 구현을 강요한다
public class MuteTv implements Tv { //implements(구현하다)

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("잘 구현함");
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
