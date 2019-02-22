
public class StringTest4 {
	public static void main(String[] args) {

		
		String originStr = "dog, cat, bird, bear";
		
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
		
	}
}
