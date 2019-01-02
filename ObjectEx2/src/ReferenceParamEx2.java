
public class ReferenceParamEx2 {
	
	public static void main(String[] args) {
		
		Data2 data = new Data2();
		
		data.num = 10;
		
		System.out.println("main() : data.num = " + data.num);
		
		data.change(data); //값이 아니라 data의 주소를 전달한 것 
		
		System.out.println("data.change 후");
		System.out.println("main() : data.num = " + data.num);
		
	}
	
	
	
}
