import java.util.Scanner;

public class WrapperEx2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String originDate = "2019년02월25일";
		String originDate2 = "2020년02월25일";
		String originDate3 = "2021년02월25일";
		
		DateUtil dateUtil = new DateUtil();
		String inputStr = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		inputStr = scan.nextLine();
		
		int userInputNum = 0;
		userInputNum = Integer.parseInt(inputStr);
		
		
		dateUtil.dateOperMethod(originDate);
		dateUtil.dateOperMethod(originDate, userInputNum);
		dateUtil.dateOperMethod(originDate2);
		dateUtil.dateOperMethod(originDate3);
		
//			
//		int yearLoc = originDate.indexOf('년');
//		int monthLoc = originDate.indexOf('월');
//		int dayLoc = originDate.indexOf('일');
//		int regexLength = 1;			// 년,월,일 의 글자길이가 1자 이므로
//		
//		int year = Integer.parseInt(originDate.substring(0, yearLoc));
//		int month = Integer.parseInt(originDate.substring(yearLoc+regexLength, monthLoc));
//		int day = Integer.parseInt(originDate.substring(monthLoc+regexLength, dayLoc));
//		
				
//		System.out.println((year+1) + "년" + month + "월" + day + "일");
//		System.out.println(year + "년" + month + "월" + (day+3)  + "일");
//		System.out.println((year+1) + "년" + (month+3) + "월" + (day-9) + "일");
		
	}

}
