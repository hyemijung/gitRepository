import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드 입력을 콘솔창에 도와주는것
		Scanner scan = new Scanner(System.in); //Scan하고 자동 완성해야 젤위의 import java.util.Scanner 가 뜸
		
		int num = 0;
	    
		num = scan.nextInt();
		
		System.out.println("숫자를 입력해주세요");
	
		num = scan.nextInt();
		
        System.out.println(num);
		
		
	}

}
