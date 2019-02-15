package root.test;

import root.parent.child.Child2;
import root.parent.child.Child3;

public class StudyTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultStr = "";
		Child3 c1 = new Child3();
		Child3 c2 = new Child3("dfs", 324);

		Child2 child2 = new Child2();
				
		
		
		resultStr = c1.nameView();
		
		System.out.println(resultStr); 		
	
	
	}

}
