package root.test;

import root.parent.child.Child2;

public class StudyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultStr = "";
		Child2 c1 = new Child2();
		Child2 c3 = new Child2("내가 만든 자식");  
		
		resultStr = c1.nameView();
//		c1.name = "이젠되나";   
//		System.out.println(c1.name);
		
		System.out.println(resultStr); 		
	
		
		resultStr = c3.nameView();
		System.out.println(resultStr);
		
	}

}
