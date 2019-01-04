
public class PracGugudan {

	void gugu() {
		int result = 0;
		for (int i = 2; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				result = i * n;
				System.out.print(i + " * " + n + " = " + result + "\t");
			}
			System.out.println();

		}

	}

	void gugu(int num) {
		int result = 0;
		for (int n = 1; n <= 9; n++) {
			result = num * n;
			System.out.print(num + " * " + n + " = " + result + "\t");
		}
		System.out.println();

	}
}
