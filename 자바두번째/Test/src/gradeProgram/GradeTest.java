package gradeProgram;

import java.io.InputStream;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = Scanner(System.in);
		Score score = new Score();
		
		
		int i = 0;

		while (true) {
			Student student = new Student();
			System.out.println("성적입력을 원하면 1을 입력해주세요\n성적출력을 원하면 2를 입력해주세요");
			
			if (scan.nextInt()!=1 && scan.nextInt()!=2) {
				return;
			}
			
			int select = scan.nextInt();

			switch (select) {
			case 1:
				score.Input(student);
				i++;
				break;
			case 2:
				score.OutPut();
				break;

			default:
				break;
			}

		}

	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
