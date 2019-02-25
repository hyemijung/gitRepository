package gradeProgram;

public class Student {

	
	private int num;
	private String name;
	private int java;
	private int dbImplement;
	private int dbUtilize;
	private int screen;
	private int sum;
//	double avg;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDbImplement() {
		return dbImplement;
	}
	public void setDbImplement(int dbImplement) {
		this.dbImplement = dbImplement;
	}
	public int getDbUtilize() {
		return dbUtilize;
	}
	public void setdDbUtilize(int dbUtilize) {
		this.dbUtilize = dbUtilize;
	}
	
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int java,int dbImplement,int dbUtilize, int screen) {
		sum = java+dbImplement+dbUtilize+screen;
	
	}

	
	
}
