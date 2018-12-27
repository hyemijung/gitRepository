
public class GugudanTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		가로방식 구구단

		for (int i = 2; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print(i + " * " + n + " = " + (i * n) + "\t");
			}
			System.out.println();
		}
	}
}
