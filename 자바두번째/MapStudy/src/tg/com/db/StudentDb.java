package tg.com.db;

import java.util.HashMap;
import java.util.Map;

import tg.com.student.Student;

public class StudentDb {
	
	private static Map<String, Student> studentMap = new HashMap();

//	한 학생의 정보 저장
		public static void setStudent(Student student) {
		String name = student.getName();
		studentMap.put(name, student);
		
	}
	
//	한 학생의 정보 불러오기
	public static Student getStudent(String name) {
		Student student = null;
		student = studentMap.get(name);
		return student;
	}
	
	
	
}
