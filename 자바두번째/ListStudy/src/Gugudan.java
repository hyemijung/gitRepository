import java.util.ArrayList;
import java.util.Iterator;

public class Gugudan {
	private int firstNo = 0;
	private int middleNo = 0;
	private int resultNo = 0;
	ArrayList<Gugudan> gugudanList = new ArrayList();
	
	public Gugudan() {

	}

	public Gugudan(int firstNo, int middleNo) {
		this.firstNo = firstNo;
		this.middleNo = middleNo;
	}

	public void printInfo() {
		resultNo = firstNo * middleNo;
		System.out.println(firstNo + " × " + middleNo + " = " + resultNo);
	}

	public int getFirstNo() {
		return firstNo;
	}

	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}

	public int getMiddleNo() {
		return middleNo;
	}

	public void setMiddleNo(int middleNo) {
		this.middleNo = middleNo;
	}

	public int getResultNo() {
		return resultNo;
	}

	public void setResultNo(int resultNo) {
		this.resultNo = resultNo;
	}

	public ArrayList<Gugudan> setNumDan(int danNum) {
	
		int danVal = 0;
		Gugudan ggd = null;

		for (int i = 0; i < 9; i++) {
			danVal = i + 1; // i자체 변경을 막기위하여
			ggd = new Gugudan(danNum, danVal);
			
			gugudanList.add(ggd);

		}
		return gugudanList;
	}

	public void guguPrint() {
		
		Iterator<Gugudan> it = gugudanList.iterator();
			
		while (it.hasNext()) {
//			System.out.println(it.next()); //틀린이유: 이렇게하면 오버라이드된 toString 내용이 나오거나, 오버라이드를 주석처리하면 서로다른 주소값 9개만 출력된다
			// it.next() 하면 구구단 하나를 꺼낸것 -> 그러니 주소다 -> 아래에 주소를 오버라이드하여 toString 한것									
			it.next().printInfo();
			
		}
		
		
	}

//	@Override
//	public String toString() {
//		return "Gugudan [firstNo=" + firstNo + ", middleNo=" + middleNo + ", resultNo=" + resultNo + "]";
//	}

}
