import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class StringHomeWork {

	public static void main(String[] args) {
	
		System.out.println("1번=====================");
//	Hellz! Nice tz meet psu.
//		o		 o		yo	
//	o를 찾아  z로 바꾼다 ->  y를 찾아 p로 바꾼다 -> replace 를 사용한다
//	index of를 사용해 psu를 만든다
	String ex1 = "Hello! Nice to meet you.";
	String change1Ex1 = ex1.replace('o', 'z');
	System.out.println(change1Ex1);
	String change2Ex1 = change1Ex1.replace('y', 'p');
	System.out.println(change2Ex1);
	int idxEx1 = change2Ex1.indexOf("zu");
	System.out.println(idxEx1);
	String change3Ex1  = change2Ex1.substring(0, 21);
	System.out.println(change3Ex1);
	String change4Ex1 = change2Ex1.substring(21);
	System.out.println(change4Ex1);
	String change5Ex1 = change4Ex1.replace('z', 's');
	System.out.println(change5Ex1);
	String finalEx1String = change3Ex1 + change5Ex1;
	System.out.println(finalEx1String);
	
	System.out.println("2번=======================");

	
//	Thank psu very much.
//		  yo
//	index of로 위치찾아, substring으로 Thank you 까지 자르고 -> replace
	String ex2 = "Thank you very much.";
	int idxEx2 = ex2.indexOf('v');
	System.out.println(idxEx2);
	String change1Ex2 = ex2.substring(0, 10);
	System.out.println(change1Ex2);
	String change2Ex2 = ex2.substring(10);
	System.out.println(change2Ex2);
	String change3Ex2 = change1Ex2.replace('y', 'p');
	System.out.println(change3Ex2);
	String change4Ex2 = change3Ex2.replace('o', 's');
	System.out.println(change4Ex2 + change2Ex2);
	
	
	System.out.println("3번========================");
//	Hellh! Nice th meet psu.\
//	    o        o      yo
//	indexof로 찾아 substring to까지 자르고, replace h를 o로 
//	yo 를 ps로 바꾸
	String ex3 = "Hello! Nice to meet you.";
	int idxEx3 = ex3.indexOf("meet");
	System.out.println(idxEx3);
	String change1Ex3 = ex3.substring(0, 15);
	System.out.println(change1Ex3);
	String change2Ex3 = ex3.substring(15);
	System.out.println(change2Ex3);
	String change3Ex3 = change1Ex3.replace('o', 'h');
	System.out.println(change3Ex3);
	String change4Ex3 = change2Ex3.replace('y', 'p');
	String change5Ex3 = change4Ex3.replace('o', 's');
	System.out.println(change3Ex3 + change5Ex3);
	
	System.out.println("4번============================");
	
	
//	thank psu very much.
//	T	  yo
//  전부 소문자로 바꿔주고
//  thank you 로 자르고 replace 바꿔준
	String ex4 = "Thank you very much.";
	String change1Ex4 = ex4.toLowerCase();
	System.out.println(change1Ex4);
	int idxEx4 = ex4.indexOf("very");
	System.out.println(idxEx4);
	String change2Ex4 = change1Ex4.substring(0, 10);
	String change3Ex4 = change1Ex4.substring(10);
	String change4Ex4 = change2Ex4.replace('y', 'p');
	String change5Ex4 = change4Ex4.replace('o', 's');
	System.out.println(change5Ex4 + change3Ex4);
	
	System.out.println("5번=====================");
	
	
//	    H! NICE TH MEET PSU.
//	    h!  ice th meet psu
//  toUppercase 하고
//  앞의 hell까지 자르고
	String ex5 = "Hellh! Nice th meet psu.";
	String change1ex5 = ex5.toUpperCase();
	System.out.println(change1ex5);
	String change2ex5 = change1ex5.substring(4);
	System.out.println(change2ex5);
	
	
//	THANK PSU VERY MUCH.
//	 hank psu very much.
//	toUppercase한다 
	
	String ex6 = "Thank psu very much.";
	String change1Ex6 = ex6.toUpperCase();
	System.out.println(change1Ex6);
	
		
		
		
		
	}
	
	
}
