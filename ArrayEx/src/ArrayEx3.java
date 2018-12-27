
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[3];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;

		System.out.println(numArr.length);

		for (int i = 0; i < numArr.length; i++) { // 배열변수명.length 사용자 실수를 줄이기 위해 만든 것 // 배열의 길이를 구할수있다 //꼭 사용!!
			System.out.println((i + 1) + "번째 수행: " + numArr[i]);

		}
	}
}
