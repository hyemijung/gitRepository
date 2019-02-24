 package gradeProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Score {
	
	
	Scanner scan = new Scanner(System.in);
	
	HashMap<Integer, Student> stu;
	int number = 0;
	
	Score(){
		scan = new Scanner(System.in);
		stu = new HashMap<Integer, Student>();
		
	}
	
	public void Input(Student student) {
		scan = new Scanner(System.in);
		
		int num = 1;
		student.setNum(num);
		num++;
		
		System.out.println(num+ "학생의 이름을 입력해주세요");
		String name = scan.next();
		student.setName(name);
		
		System.out.println(name+"의 Java 성적을 입력해주세요");
		int java = scan.nextInt();
		student.setJava(java);
		
		System.out.println(name+"의 dbImplement 성적을 입력해주세요");
		int dbImplement = scan.nextInt();
		student.setDbImplement(dbImplement);
		
		System.out.println(name+"의 dbUtilize 성적을 입력해주세요");
		int dbUtilize = scan.nextInt();
		student.setdDbUtilize(dbUtilize);
				
		System.out.println(name+"의 screen 성적을 입력해주세요");
		int screen = scan.nextInt();
		student.setScreen(screen);
		
		student.setSum(java, dbImplement, dbUtilize, screen);
	}
	
	public void OutPut() {
		
		Set<Integer> keySet = stu.keySet();
		Iterator<Integer> iterator = keySet.iterator();

		while (iterator.hasNext()) {
		    int key = iterator.next();
		    
		    System.out.println("번호 :" + stu.get(key).getNum());
		    System.out.print("이름 :" + stu.get(key).getName());
		    System.out.print("Java성적 :" + stu.get(key).getJava());
	        System.out.print("DB구현 성적 :" + stu.get(key).getDbImplement());
		    System.out.print("DB활용 성적 :" + stu.get(key).getDbUtilize());
		    System.out.print("화면단 성적 :" + stu.get(key).getScreen());
		    System.out.print(" 총점 :" + stu.get(key).getSum());
		    System.out.println();
		    
		}
	}

	
	
}
