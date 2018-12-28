
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		관련있는 정수들의 변수 
//		scoreArr[0] = 성적    국어
//		scoreArr[1] = 성적    영어
//		scoreArr[2] = 성적    수학

//		총점과 평균 구하기

		double ave = 0.0;
//		국영수국코
		int[] scoreArr = { 100, 88, 100, 100, 90, 87, 86, 12 };

		int sum = 0;
//		double sum = 0;

//		sum = scoreArr[0] + scoreArr[1] + scoreArr[2] + scoreArr[3] + scoreArr[4]				
		for (int i = 0; i < scoreArr.length; i++) {
			sum = sum + scoreArr[i];
		}
		System.out.println("총점: " + sum);

//		형변환 필요함
//		소수점 넷째자리에서 버림(소수점 셋째자리까지 표현)
//      ave = sum / 8

		ave = (int) (((double) sum / scoreArr.length) * 1000.0) / 1000.0;
//		ave = (int) ((sum / scoreArr.length) * 1000.0) / 1000.0;
		
		
		System.out.println("평균: " + ave);

	}
}
