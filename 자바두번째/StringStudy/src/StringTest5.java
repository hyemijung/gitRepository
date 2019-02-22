
public class StringTest5 {
	public static void main(String[] args) {

		
//		2019/02/22 를 가공하여, (원본도 출력)  
//		2019-02-22 를 만들어라 (가공된 것도 출력)
		
		String originDate = "2019/02/22";
		String replaceDate = originDate.replace("/", "-");
		String firstDate = originDate.replaceFirst("/", "-");
		
		System.out.println(originDate);
		System.out.println(replaceDate);
		System.out.println(firstDate);
		
//		처음 나오는 /만 - 로 바꾸기 ( 2019-02/22) - 첫번째(비객체적이라고 혼남 ㅋㅋ)
		String firstHalfDate = "2019/";
		String originDate2 = firstHalfDate + "02/22";
		String firstCutDate = firstHalfDate.replace("/", "-");
		System.out.println(originDate2);

//		처음 나오는 /만 - 로 바꾸기 ( 2019-02/22) - 객체적으로 해보자
		
		String[] newDateArr = originDate.split("/", 3);
		System.out.println(newDateArr[0]);
		System.out.println(newDateArr[1]);
		System.out.println(newDateArr[2]);
		
		System.out.println(newDateArr[0]+ "-" + newDateArr[1] + "/" + newDateArr[2]);
	
		
		
		
	
		
		
		
	}
}
