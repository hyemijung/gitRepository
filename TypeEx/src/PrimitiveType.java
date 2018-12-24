
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		저장 가능한 값의 범위
//		논리형 boolean: false, true
//		문자형 char: 0~65535
//		정수형 byte, short, int, long
//		byte: -127~127
//		short: -32,768 ~32,767
//		int: -2의 31승 ~ 반대 까지 약 +-20억
//		long: -2의 63승 ~ 반대 까지
//		실수형 float, double
//		float: 1.4E-45 ~ 3.4E38
//		double: 엄청 크다(long보다 큼)
		
		
//		boolean (true false 이외 다른값을 넣을수 없다)
//		기본값: false 
		
		boolean power = true;
		boolean checked = false;
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		System.out.println();
		
//		char 
//		싱글 따옴표를 사용하면 캐릭터를 쓰는것
//		기본값 이 공백이다.

		char ch = 'A';
//		하나의 문자만을 저장할 수 있다
//		ch = 'sa'; s와 a 두개를 사용해서 에러뜸
		ch = 's';
		
		System.out.println(ch);
//		아스키코드
		
//		인코딩 디코딩
		
//		정수형
//		byte, short, int, long
//		1,      2,    4,    8
//		bit 8, 16, 32, 64     00 01 10 11
		int num = -300000000;
		
		System.out.println(num);
		
//		byte: -127~127
		byte b = 127;
		
		b = (byte)(b + 2);
		
		System.out.println(b);

		long bigNum = 3000000000L;
//		long bigNum = 300000000034L;
//		long bigNum = 3000000000; 하면 오류남 (30억은 4바이트를 넘어섰다는 것)
//		기본값 int
//		123
//		L (Long 구분짓기 위하여 붙이는것 - 숫자 1과 헷갈리므로 대문자를 적어준다)
//		계산 
		System.out.println("long 타입: " + bigNum);
		
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		long sum = 0;
		sum = firstNum + secondNum;
//		sum은 long일지라도 이미 계산과정(이전순서)에서 정수int+int의 계산된 결과값이 -14억으로 나온상태이므로
				
		System.out.println("총 명품금액: " + sum);
		
//		실수형
//		float, double
//		4byte,  8byte
//		실수 정확도 -> 정밀도
//		float은  여섯자리까지만 표현(일곱자리 반올림되어)
//		double은 열자리까지 표현(float보다 정확도가 높아진다)- 과학의 행성거리등을 재거나할때
//		float은 잘  사용하지 않는다 주로 double을 사용
		
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
//		기본값은 더블이므로	float ff = 0.23; 하면 오류남
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		
		
		
		
		
		
		
		 
		
		
		
		
	}

}
