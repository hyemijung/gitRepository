
public class CaptionTvTest {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.power();
		
		ctv.channel = 10;
		ctv.channelUp();
		
		System.out.println(ctv.channel);
		
		ctv.displayCaption("채널ㄹㅇㄻㄹㅇㅁㄹ" +  ctv.channel); // caption이 false 이므로 출력되지 않는다
		ctv.caption = true;
		ctv.displayCaption("영화의 줄거리는" +  ctv.channel);

	}
}
