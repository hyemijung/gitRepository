import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListExTest4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 구구단 설정부분을 메서드로 옮긴후 사용하는 방법
		ArrayList<Gugudan> gugudanList = new ArrayList();

		Gugudan gugudan = new Gugudan();
		
		System.out.println("단을 써주세요");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		gugudanList = gugudan.setNumDan(num);

		
		
// 출력(iterator 사용하기)	-> 메서드로 옮겨서 	
//		Iterator<Gugudan> it = gugudanList.iterator();
		
		gugudan.guguPrint();
		
		
		
		
		

//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		
		
		
		
		
		
		
		
		// 출력(기능의 분리)
//		for (int i = 0; i < 9; i++) {
//			gugudanList.get(i).printInfo();
//		}
		
		
//		System.out.println(gugudanList.size());


		
	}

}
