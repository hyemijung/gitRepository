
public class ArrayExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[6];

//		num[0] = 0; // 배열의 시작값은 0 이다
//		num[1] = 10;
//		num[2] = 20;
//		num[3] = 30;
//		num[4] = 40;
//		num[5] = 50;
//
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
//		System.out.println(num[5]);

		for (int i = 0; i < 6; i++) {  // 배열 쓸때 i < 6 라고쓴다(6개의 공간),  i<=5 라고 적지말고
			num[i] = i * 10;
			System.out.println(num[i]);
		}

		

	}
}