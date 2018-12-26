import java.util.Scanner;

public class TriangleOperExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = "";  // 모든 문자열이 들어갈수 있다
//		int x = 0;
//		str = "안녕하세요";
//				
		
		
		
		int num = 9999;   // 초기화를 임의의 값으로한다
		Scanner scan = new Scanner(System.in); 
		String result = "";
		
		System.out.println("1, -1, 0 중에 숫자를 하나 입력해주세요");
		num =  scan.nextInt();
		
		result = ( num == 1) ? "양수" : ( num == -1)? "음수" : "0";
		
		System.out.println(result);
				
	}

}
