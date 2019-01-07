
public class Gugudan1 {

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

		for (int i = 1; i <= 9; i++) {
			System.out.print(num + " * " + i + " = " + (num * i) + "\t");

		}

	}
}