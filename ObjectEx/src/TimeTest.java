
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time KoreaTime = new Time();
		Time americanTime = new Time();
		
		KoreaTime.hour = 5;
		KoreaTime.minute = 26;
		KoreaTime.second = 31;
		
		americanTime.hour = 3;
		americanTime.minute = 26;
		americanTime.second = 31;
		
		
		System.out.println("한국시간:" + "시" + KoreaTime.hour + "분" + KoreaTime.minute + "초" + KoreaTime.second);
		System.out.println("미국시간:" + "시" + americanTime.hour + "분" + americanTime.minute + "초" + americanTime.second);
	}

}
