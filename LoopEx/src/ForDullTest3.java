
public class ForDullTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// *과 공백을 이용한 사각형 만들기	
		
			for (int i = 1; i <= 5; i++) { 	
			
				for (int n = (5-i); n >= 1; n--) { 
					System.out.print(" ");
				}
				
				for (int h = 1; h <= i; h++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		

	
			
		
	}

}
