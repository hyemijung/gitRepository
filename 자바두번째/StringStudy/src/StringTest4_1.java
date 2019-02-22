
public class StringTest4_1 {
	public static void main(String[] args) {

		
		String originStr = "dog, cat, bird, bear"; // 전체  20자 - 그안에서도 규칙이 보인다 
		
		// split을 사용하지 않고 dog, cat, bird, bear의 단어를 변수에 저장 및 출력하시오
		
//		substring 사용
		
		String dogStr = originStr.substring(0, 3);
		String catStr = originStr.substring(5, 8);
		String birdStr = originStr.substring(10, 14);
		String bearStr = originStr.substring(16, 20);
				
		System.out.println(dogStr);
		System.out.println(catStr);
		System.out.println(birdStr);
		System.out.println(bearStr);
		
//		substring, index of, char, length 를 사용해서 객체지향적으로 코드를 짜라
		
		String findWordCh = ",";   // 구분자
		
		int startPositionNum = 0;  // 문자열 시작 위치
		int wordBreakIndex = 0;  //  구분자
		wordBreakIndex = originStr.indexOf(findWordCh);  // 다른건 관심없고 구분자가 되는 위치를 알고싶은 것
		
//		System.out.println(wordBreakIndex);  
		
		  String dog = originStr.substring(startPositionNum, wordBreakIndex);

//	      String bird = originStr.substring(10, 14);
//	      String bear = originStr.substring(16, 20);

	      System.out.println(dog);

	      startPositionNum = wordBreakIndex + 2;   		// 구분자를 기준으로

	      wordBreakIndex = originStr.indexOf(findWordCh, wordBreakIndex + 1);

	      System.out.println(wordBreakIndex);

	      String cat = originStr.substring(startPositionNum, wordBreakIndex);

	      System.out.println(cat);

	      //-------------------------------------
	      startPositionNum = wordBreakIndex + 2;

	      wordBreakIndex = originStr.indexOf(findWordCh, wordBreakIndex + 1);

	      System.out.println(wordBreakIndex);

	      String bird = originStr.substring(startPositionNum, wordBreakIndex);

	      System.out.println(bird);

	      
	      startPositionNum = wordBreakIndex + 2;

//	      wordBreakIndex = originStr.indexOf(findWordCh, wordBreakIndex + 1);

//	      System.out.println(wordBreakIndex);

	      String bear = originStr.substring(startPositionNum);

	      System.out.println(bear);

//	      System.out.println("dog");
//	      System.out.println("cat");
//	      System.out.println("bird");
//	      System.out.println("bear");


		
		
		
		
		
	}
}
