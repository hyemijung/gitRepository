
public class StudentPractTest {

	public static void main(String[] args) {

								
		StudentPract student = new StudentPract();  //괄호안 매개변수 직접작성하러니 생성자가 없어서 오류남

		student.name = "정혜미";
		student.ban = 3;
		student.no = 37;
		student.kor = 100;
		student.eng = 60;
		student.math = 76;
				
		student.getAverage();
		
		System.out.println("Math.round 사용한 반올림한 평균값 출력 테스트" + student.getAverage());

	}

}
