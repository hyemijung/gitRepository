package product.test;

public class TvTest {
	public static void main(String[] args) {
		
		muteTv muteTv = new muteTv();
		
		muteTv.power();
//		muteTv.power();
//		muteTv.power();

		muteTv.channelUp();
		muteTv.channelUp();
		muteTv.channelUp();
		muteTv.channelDown();
		
		muteTv.volumeUp();
		muteTv.volumeUp();
		muteTv.volumeUp();
		muteTv.volumeDown();
		
//		muteTv.printInfo();		// 1.더이상 이렇게 호출할필요가 없다
		
		
//		System.out.println(muteTv.toString()); 	// 2.더이상 이렇게 호출할필요가 없다
		System.out.println(muteTv);  // 3.(!!중요!!!)이제 정보를 보고싶다면 이렇게 호출하면 볼수있다!!!!!(toString으로 정의되어 있으므로)
		
	}
}
