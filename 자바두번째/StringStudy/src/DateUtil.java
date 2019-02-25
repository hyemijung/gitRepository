
public class DateUtil {

	public void dateOperMethod(String originDate) {

		int yearLoc = originDate.indexOf('년');
		int monthLoc = originDate.indexOf('월');
		int dayLoc = originDate.indexOf('일');
		int regexLength = 1; // 년,월,일 의 글자길이가 1자 이므로

		int changeYear = Integer.parseInt(originDate.substring(0, yearLoc));
		int month = Integer.parseInt(originDate.substring(yearLoc + regexLength, monthLoc));
		int day = Integer.parseInt(originDate.substring(monthLoc + regexLength, dayLoc));

		System.out.println((changeYear + 1) + "년" + month + "월" + day + "일");
	}

	public void dateOperMethod(String originDate, int year) {

		int yearLoc = originDate.indexOf('년');
		int monthLoc = originDate.indexOf('월');
		int dayLoc = originDate.indexOf('일');
		int regexLength = 1; // 년,월,일 의 글자길이가 1자 이므로

		int changeYear = Integer.parseInt(originDate.substring(0, yearLoc));
		int month = Integer.parseInt(originDate.substring(yearLoc + regexLength, monthLoc));
		int day = Integer.parseInt(originDate.substring(monthLoc + regexLength, dayLoc));

		System.out.println((changeYear + year) + "년" + month + "월" + day + "일");
	}
}
