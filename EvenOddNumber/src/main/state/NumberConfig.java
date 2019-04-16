package main.state;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class NumberConfig {
	
	
	
	// 짝수 홀수 판별
	// 사용자 입력을 받는다
	


	public String NumberConfig(int x) {
		
		String resultStr = "";
		
		if (x % 2 == 0) {
			resultStr = "x는 짝수" + x;
		} else {
			resultStr = "x는 홀수" + x;
		}
			
		return resultStr;
	}
	
	
}
