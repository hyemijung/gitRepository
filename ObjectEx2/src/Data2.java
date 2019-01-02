
public class Data2 {

	int num = 0;

	 void change(Data2 data ) {
		 System.out.println("data.num의 처음 값: " + data.num);
		 data.num = 1000;
		 System.out.println("메서드를 통해 data.num의 값 수정");
		 System.out.println("data.num : " + data.num);
		 
//		 data 를 받으므로 (주소를 보냈다는 얘기) 이후에도 영향을  준다 (parma과 다른점)
	}
}
