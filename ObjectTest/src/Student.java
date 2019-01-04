
public class Student {

	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0; //멤버변수는 계속 남아 있으므로 기획안에 없으면 만들면 안됨
	
	
	Student() {

	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		int sum = 0;
		sum = kor + eng + math;
		return sum;
	}
//	int getTotal(int kor, int eng, int math) {
//		int result = kor + eng + math;
//		
//		return result;
//	}
	
	double getAverage() {
		double sum = 0;
		double average = 0;
		sum = kor + eng + math;
		
		average = ((int)(sum/3)*100.0 + 0.5)/100.0;
		
		return average;
	}
//	double getAverage(double kor, double eng, double math) {
//		double result = (kor + eng + math) / 3;
//		
//		return result;
//	}
	
	void testResult() {
	System.out.println("이름: " + name + " / 반: " + ban + " / 번호: " + no);
	System.out.println("국어: " + kor + " / 영어: " + eng + " / 수학: " + math);
	System.out.println("총점: " + getTotal());
	System.out.println("평균: " + getAverage());
}	
	
//	void testResult() {
//		System.out.println("이름: " + name + " / 반: " + ban + " / 번호: " + no);
//		System.out.println("국어: " + kor + " / 영어: " + eng + " / 수학: " + math);
//		System.out.println("총점: " + result);
//		System.out.println("평균: " + Math.round(result*1000)/1000.0);
//	}
	
}
