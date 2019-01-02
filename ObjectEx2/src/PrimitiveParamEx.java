
public class PrimitiveParamEx {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.num = 10;
		
		System.out.println("main() : data.num = " + data.num);
		
		data.change(data.num);
		
		System.out.println("data.change 후");
		System.out.println("main() : data.num = " + data.num);
		
	}
	
	
	
}
