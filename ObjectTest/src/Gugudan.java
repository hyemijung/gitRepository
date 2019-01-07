
public class Gugudan {

//	5일차 훈련일지 참고
//	구구단 가로방식
	void multiply() {
		for (int i = 0; i < 8; i++) {
			for (int n = 0; n < 9; n++) {

				System.out.print((i + 2) + " * " + (n + 1) + " = " + (i + 2) * (n + 1) + "\t");
			}
			System.out.println();
		}
	}

	
//	구구단 세로방식
	void mutiply2() {
		for (int i = 0; i < 9; i++) {
			for (int n = 0; n < 8; n++) {

				System.out.print((n + 2) + " * " + (i + 1) + " = " + (n + 2) * (i + 1) + "\t");
			}
			System.out.println();
		}
	}
}
