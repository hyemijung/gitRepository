
public class ParentGugudan {

//	샘코드 비교
//	구구단 부모

	int dan = 0;

	void perfectGugudan() {
		for (int i = 0; i < 9; i++) {
			for (int n = 0; n < 8; n++) {
				System.out.print((n + 2) + " * " + (i + 1) + " = " + (n + 2) * (i + 1) + "\t");
			}
			System.out.println();

		}
	}

}
