
public class ChildGugudan extends ParentGugudan {

//	샘코드 비교
	int dan = 0;

	void oneDanGuguPrint() {
		int dan = 2;
		int mutiply = 0;
		for (int i = 0; i < 9; i++) {
			mutiply = dan * (i + 1);
			System.out.println("2" + " * " + (i+1) + " = " + (i + 1));
		}

	}

}
