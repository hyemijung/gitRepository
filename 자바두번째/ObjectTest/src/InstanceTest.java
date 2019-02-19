
public class InstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Apple a = null;
		Apple b = null;
		Apple c = null;
		Apple d = new Apple();   // 객체가 생성되어 대입연산자를 통해 주소를 복사해준다
		
		
//		System.out.println(a.name);  //오류
//		System.out.println(b.name);	//오류
//		System.out.println(c.name);	//오류
		System.out.println(d.name);	
		
		System.out.println("==============================");
		
		a = b = c = d;		// 대입연산자를 통해 주소를 복사하여 다같이 공유한다
		
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(d.name);
		
		b.name = "세상에서 가장 맛있는 사과";
		
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(d.name);

	
		System.out.println("==============================");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	
	}

}
