
public class MuteTvTest {

	public static void main(String[] args) {

		MuteTv mTv = new MuteTv();

		for (int i = 0; i < 7; i++) { // 몇번을 돌릴 것 인지는 사용자 선택
			mTv.volume++;
		}

		System.out.println("볼륨 업 " + mTv.volume);

		mTv.muteButton();

		System.out.println("음소거 " + mTv.volume);

		mTv.muteButton();

		System.out.println("음소거 끔 " + mTv.volume);
	}

}
