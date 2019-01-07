
public class ParentChildGugudanTest {
	public static void main(String[] args) {

//		샘코드 비교
		
		ChildGugudan childG = new ChildGugudan();
		
		childG.dan = 2;
		
		System.out.println("부모의 구구단 출력");
		childG.perfectGugudan();
		
		System.out.println("자식의 인스턴스 변수를 사용한 출력");  // 인스턴스 변수는 그 물건이 존재하는 한 기록한다
		childG.oneDanGuguPrint();
		
		
		childG.dan = 3;
		System.out.println("매개변수를 사용한 출력");
		childG.oneDanGuguPrint();
		
		
		
//		구구단 세로 정렬
//		for (int i = 0; i < 9; i++) {
//			for (int n = 0; n < 8; n++) {
//
//				System.out.print((n + 2) + " * " + (i + 1) + " = " + (n + 2) * (i + 1) + "\t");
//			}
//			System.out.println();
//		}
		
		
		
		
//		구구단 가로 정렬
//		for (int i = 0; i < 8; i++) {
//			for (int n = 0; n < 9; n++) {
//			dan = (i+2) * (n+1);
//			System.out.print((i+2) + " * " + (n+1) + " = " + (i+2) * (n+1) + "\t");
//			}System.out.println();
//		}
		
	}

}
