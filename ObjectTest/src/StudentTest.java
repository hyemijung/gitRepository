
public class StudentTest {
	public static void main(String[] args) {
		
		String name = "홍길동";
		int ban = 2;
		int no = 1;
		int kor = 100;
		int eng = 60;
		int math = 76;
		
		
		Student student = new Student(name, ban, no, kor, eng, math);
		
		
//		student.testResult(); // 샘 기획안에 결과출력 메서드를 만들라는 말 없었음
		
//		System.out.println("이름: " + name + " / 반: " + ban + " / 번호: " + no);
//		System.out.println("국어: " + kor + " / 영어: " + eng + " / 수학: " + math);
//		student.getTotal(kor, eng, math);
//		System.out.println("총점: " + result);
//		student.getAverage(kor, eng, math);
//		System.out.println("평균: " + Math.round(result*1000)/1000.0);
	}
	
}
