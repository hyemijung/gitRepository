
public class RemoteControllerTest {
public static void main(String[] args) {
	
	CaptionRemoteController crc = new CaptionRemoteController();
	
	crc.channel = 7;
	System.out.println("채널을 7로 변경하였습니다");
	
	System.out.println("현재 채널은 " + crc.channel);
	
}
}
