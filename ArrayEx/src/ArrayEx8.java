
public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int min = 0;
		int[] scoreArr = { 79, 88, 91, 33, 100, 55, 95};

		max = scoreArr[0];
		min = scoreArr[0];

//		for (int i = 0; i < scoreArr.length; i++) {
//			if (scoreArr[i] > max) {
//				max = scoreArr[i];
//			} else if (scoreArr[i] < min) {
//				min = scoreArr[i];
//			}
//
//		}

		
//		기능의 분리 (가 되야 협업과 분배가 가능하다)
//		max 와 min이 같이수행되고 있는데 이를 분리해라
		
		for (int i = 0; i < scoreArr.length; i++) {
			if (scoreArr[i] > max) {
				max = scoreArr[i];
			}
		}
		
		for (int i = 0; i < scoreArr.length; i++) {
			if (scoreArr[i] < min) {
				min = scoreArr[i];
			}
		}

		System.out.println("최대값: " + max);
		System.out.println("최소값; " + min);

	}
}
