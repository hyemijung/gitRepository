package test.state;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import main.state.NumberConfig;



public class NumberConfigTest {
	
	NumberConfig eo = new NumberConfig();
	
	// 짝수 홀수 판별
	// 사용자 입력을 받는다

	
	@Test
	public void testNumberConfig() {
		
		int x;
		String str = "";
		
		x = 5;
		
		str = eo.evenOddNumber(x);
		
		Assert.assertEquals("x는 홀수" + x, str);
//		Assert.assertTrue("x는 홀수" + x, str);
	}
	
	
}
