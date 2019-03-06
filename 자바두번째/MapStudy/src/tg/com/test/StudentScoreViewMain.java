package tg.com.test;

import java.util.Scanner;

import tg.com.db.StudentDb;
import tg.com.student.Student;

public class StudentScoreViewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 String groupName = "";
		 String name = "";
		 int goodLifeScore = 0;
		 int speechWriteScore = 0;
		 int physicalScore = 0;
		 int totalScore = 0;
		 String lifeRecord = "";
		 Student student = null;
		 
		 		 
		 groupName = "성실반";
		 name = "이명선";
		 goodLifeScore = 70;
		 speechWriteScore = 100;
		 physicalScore = 50;
		 totalScore = goodLifeScore + speechWriteScore + physicalScore;
		 lifeRecord = "성실하고 착하나 몸이 약함";
		 
		 student = new Student(groupName, name, goodLifeScore, speechWriteScore, physicalScore, totalScore, lifeRecord );
		
//		 System.out.println(student1);
//		 student1.showStudentInfo();
		 StudentDb.setStudent(student);
		 
		 groupName = "성실반";
		 name = "박기성";
		 goodLifeScore = 80;
		 speechWriteScore = 100;
		 physicalScore = 30;
		 totalScore = goodLifeScore + speechWriteScore + physicalScore;
		 lifeRecord = "게임을 많이 좋아하나 학업 성적 우수함 단지 몸이 약함";
		
		 student = new Student(groupName, name, goodLifeScore, speechWriteScore, physicalScore, totalScore, lifeRecord );
		 
		
//		 student2.showStudentInfo();
		 StudentDb.setStudent(student);
		 
		 groupName = "성실반";
		 name = "윤승환";
		 goodLifeScore = 100;
		 speechWriteScore = 90;
		 physicalScore = 100;
		 totalScore = goodLifeScore + speechWriteScore + physicalScore;
		 lifeRecord = "성실하고 착하며 건강함 단 칭찬에 약함";
		 
		 
		 
		 student = new Student(groupName, name, goodLifeScore, speechWriteScore, physicalScore, totalScore, lifeRecord );

		 
//		 student3.showStudentInfo();		
		 StudentDb.setStudent(student);
		

		 
		 Scanner scan = new Scanner(System.in);
		 String searchName = "";
		 while(true) {
			 System.out.println("검색하실 학생의 이름을 입력해주세요");
			 searchName = scan.nextLine();
			 student = StudentDb.getStudent(searchName);
			 student.showStudentInfo();
			 
		 }
		 
		 
	}

}
