
public class OperEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		소수점 내림처리 (평균내거나 절삭할때 사용됨)-필수기술
		
		double pi = 0.0;
		double shortPi = 0.0;
		double roundPi = 0.0;
				
		pi = 3.141592;  // 소수점 셋째자리까지
		shortPi = (int)(pi * 1000) / 1000.0; //괄호부터 //(기억하자!!)
		
		System.out.println("소수점 3째자리까지 표현: " + shortPi);

//		반올림처리
		
		roundPi = (int)(pi * 1000 + 0.5);
//		3141.592 + 0.5 -> 3142.092
//		3142/1000.0
//		4째자리에서 반올림해야 3째자리까지 표현
		
		roundPi = roundPi / 1000.0;
		
		System.out.println("소수점 4째자리에서 반올림 표현: " + roundPi); 
//		 3141.592 + 0.5 -> 3142.092
//		3142/1000.0
//		4째자리에서 반올림해야 3째자리까지 표현
		
		

		
		
	}

}
