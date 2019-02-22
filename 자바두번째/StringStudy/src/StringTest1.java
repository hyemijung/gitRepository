
public class StringTest1 {
	public static void main(String[] args) {

		
//		문자역은 100% 객체이다

//		String str = "Hello";
		
//		String s = new String("Hello");
//		System.out.println(s);
      
//      char[] c = {'H', 'e', 'l', 'l', 'o'};
//		String s = new String(c);
//		System.out.println(c);  // System(도 클래스다)
//		System.out.println(s);
      
//      StringBuffer sb = new StringBuffer("Hello");
//      String s2 = new String(sb);
//      System.out.println(s2);
//      
////      char charAt
//      String s3 = "Hello";   // 캐릭터 배열이다 <- 그러므로 인덱스번호로 찾아서 접근 가능해진것
//      String  n = "0123456";
//
//      char c02 = s3.charAt(4);
//      char c22 = n.charAt(1);      
//      System.out.println(c02);
//      System.out.println(c22);
//      
//      String nameStr = "박성욱";
//      char lastName = nameStr.charAt(0);
//      System.out.println(lastName);
		
//      int compareTo(Stringstr) // 문자열끼리 사전순으로 비교한다
		// 앞에 글자가 작으면 음수,		
		// 앞의 글자가 크면 양수
//		"ㄴㅇㄹ" - 문자열도 객체다 -> "ㄴㅇㄹ". 찍어 객체처럼 사용가능하다
//		String  tempStr = "";
//		str.compareTo(tempStr);
	
		
//      int i = "aaa".compareTo("aaa");  	// "aaa".
//      int i2 = "aaa".compareTo("bbb");
//      int i3 = "bbb".compareTo("aaa");
//      System.out.println("i = " + i);
//      System.out.println("i = " + i2);
//      System.out.println("i = " + i3);
      
//      //String concat(String str)  // 우린 + 더하기 연산자를 concat 대신 사용한다
//      String s = "Hello";
//      String s2 = s.concat("World");
//      System.out.println(s);
//      System.out.println(s2);
      
////      boolean contains (CarSequence s)			// 중요!!!!!!!!!!! // 욕설같은거 걸러낼때 사용
//      String s = "abcdefg";
//      boolean b = s.contains("bc");		// ("b c") 이렇게 하면 공백까지 인식한다 bc를 찾는것이 아님
//      -> 지역변수에 담지않으면 의미가 없는것
//      System.out.println(b);
      
////   boolean endsWith(String suffix)		// 마지막 글자를 찾는 기술 // 중요도 좀 떨어짐
//      String file = "Hello.txt";
//      String file2 = "Hello.1txt";
//      String file3 = "Hello.txt2";
//      boolean b = file.endsWith("txt");
//      boolean b2 = file2.endsWith("txt");
//      boolean b3 = file3.endsWith("txt");
//      System.out.println(b);
//      System.out.println(b2);
//      System.out.println(b3);
      
////      boolean equals(Object obj)          // 100% 중요!!!!!!!!!꼭 알아야!!!!!!!!!!!
//      String s = "Hello";					// 객체를 만들때 new 를 사용하지않고 이렇게 만들수 있다
//      boolean b = s.equals("Hello");		// equals 는 비교연산자(같은 메서드다) // 오버라이딩 되어 여기서는 문자열끼리 비교한다
//      									// object에 있는것 오버라이딩 -> 원래 equals 는 객체끼리 비교하는 메서드
//      boolean b2 = s.equals("hello");
//      System.out.println(b);
//      System.out.println(b2);
//      
//      String strObj = new String("Hello");
//      String aaa = "Hello";
//      System.out.println("Hello" == "Hello");
//      System.out.println("Hello" == strObj);		// == 으로 비교는 숫자를 비교할때 사용한다
//      System.out.println("Hello".equals(strObj));   // 문자열 비교는 equals 로한다!!!!!!!!!!!!!!!!!!!!
//      System.out.println("Hello" == "hello");
//      System.out.println(aaa == "Hello");
      
////      boolean equalsIgnoreCase(String str)		// 문자열 비교(대소문자 구별하지 않는다)
//      String s = "Hello";
//      boolean b = s.equalsIgnoreCase("HELLO");
//      boolean b2 = s.equalsIgnoreCase("Hello");
//      System.out.println(b);
//      System.out.println(b2);
      
////      int indexOf(int ch)				// !!!!엄청 중요!!!!!
//      String s = "Hello";
//      int idx1 = s.indexOf('o');   //왜 얘만 싱글따옴표? // "" 는 문자열, ''는 char
//      int idx2 = s.indexOf('k');
//      int idx3 = s.indexOf('l');  // 배열에는 순서가 있으므로 처음 나오는 l을 찾는다
//      System.out.println(idx1);
//      System.out.println(idx2);
//      System.out.println(idx3);
//      
//      String str;
//      str = "가나다라";
//      System.out.println(str.indexOf('나'));
      
//      contains(); 를 하려면 indexOf와 char ????? 뭐가 더 필요하다고???
      
      
      
////      int indexOf(int ch, int pos)		// 어디서부터 문자를 찾을래?
//      String s = "Hello";
//      int idx1 = s.indexOf('e',0);
//      int idx2 = s.indexOf('e',2);  // 첫 l부터 e를 찾았으므로 못찾아서 -1을 반환
//      System.out.println(idx1);
//      System.out.println(idx2);
      
////      int indexOf(String str)		// 아주중요!!!!!!!!!!!!!!!
//      String s = "ABCDEFG";
//      int idx = s.indexOf("CD");     // 문자열의 인덱스도 찾을수 있다
//      int idx2 = s.indexOf("ABCDEFG");
//      System.out.println(idx);
//      System.out.println(idx2);
      
////      String intern() 상수풀(constant pool)?? 이해안됨 , 메모리에 관련된 것
//      String s = new String("abc");
//      String s2 = new String("abc");
//      boolean b = (s==s2);
//      boolean b2 = s.equals(s2);
//      boolean b3 = (s.intern()==s2.intern());
//      System.out.println(b);
//      System.out.println(b2);
//      System.out.println(b3);
      
////      int lastIndexOf(int ch)
//      String s = "java.lang.Object";
//      int idx1 = s.lastIndexOf('.');
//      int idx2 = s.indexOf('.');
//      System.out.println(idx1);
//      System.out.println(idx2);
      
////      int length()							// 문자열의 길이를 알수있다
//      String s = "Hello";
//      int length = s.length();
//      System.out.println(length);
      
////      String replace(char old, char nw)			// 치환(가공)
//							백업		새로운 것
//	  String s = "HelloH";						// 안에 해당되는 모든 것을 바꾼다
//      String s1 = s.replace('H', 'C');
//      String s2 = s.replace('H', 'Z');
//      String s3 = s.replace("He", "Z");
//      System.out.println(s);		// s 는 그대로(원본은 그대로 지켜짐)
//      System.out.println(s1);		// s1이 바뀐 것이지(가공한 것)
//      System.out.println(s2);		// s2이 바뀐 것이지(가공한 것)
//      System.out.println(s3);
      
////      String replaceAll(String regex, String replacement)
//      String ab = "AABBAABB";
//      String r = ab.replaceAll("BB", "bb");
//      System.out.println(r);
      
////      String replaceFirst(String regex,  String replacement)
//      String ab = "AABBAABB";
//      String r = ab.replaceFirst("BB", "bb");
//      System.out.println(r);
      
////      String[] split(String regex)
//      String animals = "dog, cat,bear";			// 문자열을 구분자(일정한 패턴을 가진)를 통해(기준으로), 쪼개어 배열에 저장
//      String[] arr = animals.split(",");		// 구분자가 존재하면 , 구분자를 기준으로 나눠진다
//      for (int i = 0; i < arr.length; i++) {	
//		System.out.println(arr[i]);
//	}
//      System.out.println(arr[0]);
//      System.out.println(arr[1]);
//      System.out.println(arr[2]);
      
////      String[] split(String regex, int limit)
//      String animals = "dog,cat,bear";
//      String[] arr = animals.split(",",3);		// 문자열 전체를 지정된 갯수로 자른다(지정된 갯수만큼의 배열을 만들겠다)
//      System.out.println(arr[0]);
//      System.out.println(arr[1]);
//      System.out.println(arr[2]);
      
////      boolean startsWith(String prefix)
//      String s = "java.lang.Object";
//      boolean b = s.startsWith("java");
//      boolean b2 = s.startsWith("lang");
//      System.out.println(b);
//      System.out.println(b2);
      
////      String substring(int begin)
////      String substring(int begin, int end)			// 100% 알아야해!!!!!!!!!!!!!
//      String s = "java.lang.Object";
//      String c = s.substring(10);
//      String p = s.substring(5,9);
//      System.out.println(c);
//      System.out.println(p);
            
////      String toLowerCase()
//      String s = "Hello";
//      String s1 = s.toLowerCase();
//      System.out.println(s1);
      
////      String toString()					// 무조건 알아야!!!!!
//      String s = "Hello";
//      String s1 = s.toString();			// 오버라이딩 안했으면 원래 주소값이 나옴
//      System.out.println(s1);
      
////      String toUpperCase()
//      String s = "Hello";
//      String s1 = s.toUpperCase();
//      System.out.println(s1);
      
		
//	      String s = "  Hello World  12";
//	      String s1 = s.trim();
//	      System.out.println(s1);
	      
//	매개변수에 던져진 것을 모두 문자열로 치환해준다
//		  String b = String.valueOf(true);  // 원래는 이렇게 해야했음
//		  b = true + "";					// 지금은 이렇게 가능
//		  
//		  String c = String.valueOf('a');
//	      String i = String.valueOf(100);
//	      String i2 = String.valueOf(100)+1;
//	      
//	      String l = String.valueOf(100L);
//	      String f = String.valueOf(10f);
//	      String d = String.valueOf(10.0);
//	      java.util.Date dd = new java.util.Date();
//	      String date = String.valueOf(dd);
//	      
//	      System.out.println(b);
//	      System.out.println(c);
//	      System.out.println(i);
//	      System.out.println(i2);
//	      
//	      System.out.println(l);
//	      System.out.println(f);
//	      System.out.println(d);
//	      System.out.println(date);
	      
	}
}
