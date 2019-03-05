
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
					
			if (i % 2 == 0) {
				continue;       // continue를 만나면 아래를 수행하지않고 다시 위로 올라간다 // 컨티뉴는 가능하면 쓰지말라는 것이 권고 사항
			}
			
			System.out.print(i + "\t");
		}
		
	}

}
