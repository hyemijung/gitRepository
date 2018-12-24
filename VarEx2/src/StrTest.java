
public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		문자형 (무조건 한글자만 적을수 있음)
		char ch = ' '; // 초기값(공백)
		
//		문자열 
//		String strDefault = null; // 초기값(어떤값인지 모르겠다는 의미)
		String str = "";  //초기값,초기화 (어떤 다른 내용들과 합쳐져도 영향을 주지 않아야한다)
		String name = "";
		
//		문자열 특징
//		문자열 + any type -> 문자열 + 문자열 -> 문자열
//		any type + 문자열 -> 문자열 + 문자열 -> 문자열 
		
//		concat
		str = "Ja" + "va"; //Java
		name = str + 8.0;  // "8.0" 이라는 문자열과 더해진것 //Java8.0 
		
		System.out.println("str : " + str);
		System.out.println("name : " + name);
		
		String  string = "";
//		String = 7; 오류
//		String = 7 + "" + true; // 뭘더해도 문자열이 하나 더해지면 다문자열
		
		System.out.println(string);
		
		 System.out.println(name);
		 System.out.println(str);
		 System.out.println(7 + " ");
		 System.out.println(" " + 7);
		
		
		
		
		
		
		
		
				
	}

}
