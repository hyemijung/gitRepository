
public class MoonGravityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight = 0.0;   //int weight = 0; 으로하면 결과 제대로 안나옴
		
		// 달에서의 중력은 1/6
//		자신의 몸무게를 구하는 공식: weight / 6
		double moonMyWeight = 0.0;
		
		weight = 67;  // 61, 68을 입력해도 결과 같음 -> 소수점 필요
		moonMyWeight = weight / 6;  // int / int (int weight = 0;라고 선언하면) -> int -> 11 -> 11.0		
		moonMyWeight = ((int)(moonMyWeight * 10)) / 10.0;
		// 11.166666666666667
		// 111.6666666666667
		// 111
		// 11.1
		System.out.println("나의 몸무게는 " + weight);
		System.out.println("달에서의 몸무게: " + moonMyWeight);
		
		
		
	}

}
