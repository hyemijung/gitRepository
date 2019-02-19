
public class UnderstandTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tv smartTv = new SmartTv();
		
		smartTv.channelUp();
		smartTv.channelUp();
		smartTv.channelUp();
		smartTv.channelDown();
		smartTv.power();
		smartTv.power();
//		smartTv.internetSwitch();   //오류 :이전의 Tv 설계도로 만든 변수 smartTv로는, 새로운 SmartTv()의 인터넷스위치를 조작할 버튼이없다 조작할수 없다
//																		, 새로운 SmartTv() 안에 있는 기능들중 Tv설계도에도 있는 기능들만 조작할수 있다	
		
		System.out.println(smartTv.channel);
		System.out.println(smartTv.power);
		
		
	}

}
