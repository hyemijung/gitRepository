
public class ForDuliTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i < 5; i++) { // 행 5개 //반복문의 시작은 0 부터, int i =0
			for (int n = 0; n <= i; n++) { // n <= i 를 넣도록? 규칙을 적어서 발견해서
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
