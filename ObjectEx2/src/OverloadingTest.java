
public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mycalc mc = new Mycalc();
		
		int result = 0;
		
		result = mc.add(3,  5);
		System.out.println(result);
		
		result = (int)mc.add(3L,  5L);
		System.out.println(result);
		
	}

}
