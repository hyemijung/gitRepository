
public class Test1 {
	public static void main(String[] args) {

//		1~100 까지 중 짝수만 출력되게 하시오

		for (int i = 1; i <= 100; i++) { // 1부터인데 i=0부터 시작하면 틀린 것
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		
		
	}
}
