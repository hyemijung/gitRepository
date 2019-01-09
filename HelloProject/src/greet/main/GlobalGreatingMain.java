package greet.main;

import greet.america.Hello;  // 풀 네임  //클래스의 실제 이름(full name)은 패키지명을 포함한 것
//import java.lang.*; // 이 존재하고 있었음 그래서 import문 없이 syso같은 것들을 사용할수 있었음
//import greet.korea.Hello; // 에러뜸(The import greet.korea.Hello collides with another import statement)
                             // 마지막 이름이 Hello로 같아서 오류뜸 - 마지막 이름이 같으면 무조건 import는 하나만 등록된다 
                             // 그럼 다른 하나가 쓰고싶다면? 그럼 사용하고자 하는 클래스이름 앞에 패키지명을 붙여준다  

import greet.america.HelloKorea; // 풀네임 // 아래 import없이 써서 에러난것을 수정가능 // 클래스 2개를 상용하려면 2개를 import 해줘야함
//ctrl + shift + o : 자동 import (중요!!!!!)  // 자동으로 import문 적어줌                                 

import greet.america.*;  
//import 패키지명.*;

//ctrl + shift + o : 자동 import (중요!!!!!)
//-> 해서 일일히 쓰려는 클래스명만큼 만든거랑의 차이??
//-> ctrl + shift + o 할필요가 없음 // 왜? 에스테리크가 전체라는 뜻을 포함하므로 이것 하나로 다처리됨

//에스테리크 * : 전체라는 뜻


// import

//소스코드를 작성할 때 다른 패키지의 클래스를 사용하려면 
//패키지명(폴더명)이 포함된 클래스 이름을 사용해야 한다

//클래스 코드를 작성하기 전에 import문을 사용하고자 하는 클래스의 패키지를 
//미리 명시해주면 소스코드에 사용되는 클래스 이름에서 패키지명은 생략할 수 있다.

//import문의 역할은 컴파일러에게 소스파일에 사용된 클래스의 패키지에 대한 정보를 
//제공하는 것이다
//컴파일 시에 컴파일러는 import문을 통해 소스파일에 사용된 클래스들의 패키지를
//알아 낸 다음, 모든 클래스이름 앞에 패키지 명을 붙여준다

//일반적인 소스파일(*.java)의 구성은 다음의 순서로 되어 있다
//1. package문
//2. import문
//3. 클래스 선언

//import 표현식
//import 패키지명.클래스명;
//or
//import 패키지명.*;

//greet.main

public class GlobalGreatingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello aHello = new Hello(); // import문이 있을때 사용하는 방식
		
		aHello.goodMorningPrint();
		aHello.afterNoonPrint();
		
		HelloKorea koreaHello = new HelloKorea(); // import한적 없어 에러
		
//		greet.korea.Hello kHello = new greet.korea.Hello();  // import문이 없을때 사용하는 방식
//		
//		kHello.goodMorningPrint();
		
		
		
	}

}
