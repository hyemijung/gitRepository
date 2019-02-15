package statics;



public class StaticTest {

		static int width = 200;
		static int height = 120;
		
		String name = "";
		
		 static int max(int num, int num2) {
			int testNum = 0;
			
//			test(2, 3, 3);   // 메서드 안에서 메서드 호출가능 (하지만 static 안에서는 안된다)
			
			return num> num2 ? num : num2;
		}

		int test(int num1, int num2, int num3) {
			name = "홍길동";
			System.out.println(name);
			return num1> num2 ? num1 : num2;
		}

		
}
