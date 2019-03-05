import java.util.ArrayList;

public class ListExTest4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 구구단 설정부분을 메서드로 옮긴후 사용하는 방법
		ArrayList<Gugudan> gugudanList = new ArrayList();

		Gugudan gugudan = new Gugudan();
		
		gugudanList = gugudan.setNumDan(2);
		
		
		
		
		
		
		
		
		
		
		
		
		// 아래 사항 - 구구단 설정을 메서드로 만들수 있다
		Gugudan ggd = null;
		int danVal = 0;
		for (int i = 0; i < 9; i++) {
//			Gugudan ggd = new Gugudan(2, i + 1);   // i를 변경하면 안된다 -> 새로운 변수로 선언하라
			danVal = i + 1;							// i자체 변경을 막기위하여			
//			ggd = new Gugudan(2, i + 1);
			ggd = new Gugudan(2, danVal);
			gugudanList.add(ggd);
//			gugudanList.get(i).printInfo(); -> 기능의 분리해야
		}
	
		
		
		
		// 출력(기능의 분리)
		for (int i = 0; i < 9; i++) {
			gugudanList.get(i).printInfo();
		}
		
		
//		System.out.println(gugudanList.size());


		// 훈일씨가 궁금해한거 한개씩 풀어서 생각
//		Gugudan ggd = new Gugudan(2, i + 1);
//		gugudanList.add(ggd);
//		Gugudan ggd = new Gugudan(2, i + 1);
//		gugudanList.add(ggd);

		
	}

}
