
public class Calc2 {

//	return문
//	메서드가 정상적으로 종료가 되는 경우
//	- 메서드의 블럭{}내의 마지막 문장까지 수행했을 때 -> 반환 타입 void
//	- 메서드 블럭{}내에 있는 문장을 수행 중 return 문을 만났을 때  //return뒤에 어떤것이 얼마나 있어도 수행불가(unreachable code)

//	반환 타입 void (공허) - 반환할 값이 없을 때 사용
	void add(int num, int secondNum) {
		int result = num + secondNum; // 더하는 메서드를 만든것

		System.out.println(num + "+" + secondNum + "의 결과는"); // void는 반환값이 없으므로 바로 출력결과를 적어주면 된다(그 자체로서 기능의 완성)
		System.out.println(result);

		 
//		void를 쓸 경우 - 설정, 출력
	}
}
