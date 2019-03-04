import java.util.ArrayList;

public class ArrayListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add("당연하지:");
		
		
		// 다형성
		int num = (int) list.get(0);  //object 타입을 (int)를 붙여 int타입으로 형변환해줌

		int num2 = (int) list.get(1);
		
		
		int sum = num + num2;
		String str = (String) list.get(2);  //object 타입을 (String)를 붙여 String타입으로 형변환해줌
		
		System.out.println(sum);
		
		
		
		
		
	}

}
