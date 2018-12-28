import java.util.Scanner;

public class BMIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight = 0.0;
		double height = 0.0;
		double bmi = 0.0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 : ");
		height = scan.nextDouble() * 0.01;
		
		System.out.println("자신의 체중을 입력해주세요");
		weight = scan.nextDouble();
		
		bmi = weight / (height * height);

		if (bmi >= 30) {
			System.out.println("당신은 비만입니다");
		}else if(bmi >= 25) {
			System.out.println("당신은 과체중입니다");
		}else if(bmi > 18.5) {
			System.out.println("당신은 정상입니다");
		}else
			System.out.println("당신은 저체중입니다");

	}

}
