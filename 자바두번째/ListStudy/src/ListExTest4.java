import java.util.ArrayList;

public class ListExTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> twoDan = new ArrayList();

//	기본형도 전부 클래스를 가질수있다		
//		ArrayList<Character> twoDan32 = new ArrayList(); // 캐릭터도 클래스가 있단다
//		Character cc = new Character(' ');
//		Boolean check = false;
		
		for (int i = 1; i < 10; i++) {
			int tDan = 2 * i;
			twoDan.add(tDan);
			System.out.println(tDan);
//			System.out.println("2 * " + i + " = " + tDan);
//			System.out.println(twoDan.get(i)); // 여기서 출력하려하면 IndexOutOfBoundsException 뜸
			System.out.println(twoDan);

		}

		System.out.println();
		
		
		System.out.println("2단");
		for (int i = 0; i < twoDan.size() ; i++) {
			System.out.println(twoDan.get(i));
			
		}

		
		
		
		
		
//		int twoDan = 0;
//		for (int i = 1; i < 10; i++) {
//			twoDan = 2 * i;
//			System.out.println("2 * " + i + " = " + twoDan);
//		}

	}

}
