package greet.america;

public class Hello {

	// 접근제어자
//	변수, 메서드, 클래스, 인터페이스
//	public 공익의, 공공의 - 를 붙여 누구든지 사용이 가능하다고 공개해준것
//	이외에 숨길려면 접근제어자를 통한 캡슐화를 하여 건들지 못하도록 함

//	public  // 이 없으면 default void 메서드로 인식- default로 인식한다(같은 경로만 볼수있는것)
//	public을 붙이면 전역에서 사용가능 (누구든지 사용가능 - 어떤 다른 클래스든지 접근이 가능)
// 클래스명 앞에 public이 붙어있어야 다른 클래스에서도 사용가능 -> 없으면 같은 폴더안에 있는 클래스만 접근 가능

//	메서드 앞에 public이 붙으면 역시 다른 클래스에서 이 메서드로 접근가능

//	폴더 다르다, 패키지가 다르다  // 비슷해보이지만 서로 다른 클래스

	public void goodMorningPrint() {
		System.out.println("goodmoring i'm find and you");
	}

	public void afterNoonPrint() {
		System.out.println("good afternoon how was your lunch?");
	}

}
