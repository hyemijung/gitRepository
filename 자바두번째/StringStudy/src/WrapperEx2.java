
public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1 = "300";
		String str2 = "200";
		
		int num1 = Integer.parseInt("300");
		int num2 = Integer.parseInt("200");
		
//		System.out.println("총합: " + (num1 + num2)); // 문자열+숫자+숫자 - (괄호없다면) 연산순서에 따라 문자열이되어 그대로 더해진것
		System.out.println(num1 + num2 +"총합: "); //숫자+숫자+문자열 - 연산순서에따라 앞의 두숫자의 연산이 이루어지고 뒤에 문자열을 만나 문자가 된것
		
		String date = "2019년02월25일";
		
		//문자를 제거해야, 문자열을 숫자로 변환가능해진다
		//어떻게 문자를 제거할래? 년 월 일을 어떻게 잘라낼까?
		
		
//		1단계 난이도. 2020년02월25일
		String year = date.substring(0, 4);
		System.out.println(year);
		
		String month = date.substring(5, 7);
		System.out.println(month);
		
		String day = date.substring(8, 10);
		System.out.println(day);
		
//		String newDate = year+month+day;
//		System.out.println(newDate);
//		int date2 = Integer.parseInt(newDate);
		
		int year2 = Integer.parseInt(year);
		System.out.println(year2);
		
		String newDate1 = (year2+1) +"년" + month +"월" + day + "일";
		System.out.println("1단계 난이도: " + newDate1);
		
		  
//		2단계 난이도. 2019년02월28일
		
		int day2 = Integer.parseInt(day);
		System.out.println(day2);
		
		String newDate2 = year +"년" + month +"월" + (day2 + 3) + "일";
		System.out.println("2단계 난이도: " + newDate2);
		
		
//		3단계 난이도. 2020년05월16일
		
		int month2 = Integer.parseInt(month);
		
		
		String newDate3 = (year2+1) +"년" + "0" + (month2+3) +"월" + (day2-9) + "일";
		System.out.println("3단계 난이도: " + newDate3);
//		String newDate
		
		
//		위의 과정을 객체제향적으로 하려면?
		
	}

}
