import java.util.Scanner;

public class ArrayEx9Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		
		int[] rndNum = new int[5];
		
		rndNum = scan.next();
		
		System.out.println("입력시 5개의 숫자는 겹쳐서 넣으면 안됩니");
		System.out.println();
		System.out.println("1번째 숫자를 입력하세요");
		System.out.println();
		System.out.println("2번째 숫자를 입력하세요");
		System.out.println();
		System.out.println("3번째 숫자를 입력하세요");
		System.out.println();
		System.out.println("4번째 숫자를 입력하세요");
		System.out.println();
		System.out.println("5번째 숫자를 입력하세요");
		System.out.println();
		
	 int temp = 0;
	 int rndNum2 = 0;
	 
		
		for (int i = 0; i < 5; i++) {
			rndNum = (int)(Math.random() * 5);
			temp = rndNum[i];
			rndNum[i] = rndNum[rndNum2];
			rndNum[rndNum2] = temp;
		}
			
		
		
		
		
	}
}
