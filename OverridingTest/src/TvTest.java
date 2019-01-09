
public class TvTest {

	public static void main(String[] args) {

		Tv tv = new Tv();

		tv.power(); // tv 켬
		tv.channelUp(); // 채널 업 -> channelUp = 1
		tv.tvInfo();

		CaptionTv cTv = new CaptionTv();
		cTv.channelUp();
		cTv.channelUp();
		cTv.tvInfo();
		
	}
}
