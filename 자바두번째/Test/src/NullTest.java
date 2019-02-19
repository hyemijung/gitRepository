
public class NullTest {
		
	static String testStr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		기본값
//		int, char, long, double, boolean
//		' '
//		""
//		flase
				
//		선언문 
//		int num;
//		char ch;
//		boolean flag;
//		double d;
		
//		지역변수들일 뿐
		int num = 0;
		char ch = ' ';
		boolean flag = false;
		double d = 0.0;
//		의미있는 값을 넣어야 오류가 아니다 <-> 의미있는 값을 넣지않으면 오류가 맞다
//		null(의미없는 값) - 은 객체에만 들어갈수 있는 값
		System.out.println(num);
		System.out.println(ch);
		System.out.println(flag);
		System.out.println(d);
		
		
		String str ="";   // 문자열 초기화
		String str2 = null;  // 문자열에 null이 들어간다는 것은 이 문자열은 객체라는 것이다!!!!!! 
							// 객체에 null이 들어가면, . 을 찍어서 할수있는건 아무것도 없다
//			null로 객체를 초기화하는 것은 - 미래의 언젠가는 사용할것이라는 것을 명시
//			지역변수는 무조건 초기화 하여야한다
//			객체는 null로 초기화 하는것이 기본이다
		str.toString();	//오류아님
		str2 = "sdff";
		str2.toString(); //오류남
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println("내가 인스턴스 변수야: " + testStr);
	}

}
